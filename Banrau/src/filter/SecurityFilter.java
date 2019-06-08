package filter;
//kiểm tra các yêu cầu trc khi cho phép truy cập vào các page
import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserAccount;
import request.UserRoleRequestWrapper;
import utils.AppUtils;
import utils.SecurityUtils;

@WebFilter("/*")
public class SecurityFilter implements Filter{

	public SecurityFilter() {
    }
	
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
	throws IOException, ServletException{
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		String servletPath = request.getServletPath();
		
		//thông tin người dùng được lưu trong session
		//sau khi login thành công
		
		UserAccount loginedUser = AppUtils.getLoginUser(request.getSession());
		
		if(servletPath.equals("/login")) {
			chain.doFilter(request, response);
			return;
		}
		HttpServletRequest wrapRequest = request;
		
		if(loginedUser != null) {
			//tên tk
			String userName = loginedUser.getUserName();
			
			//các vai trò 
			List<String> vaitros = loginedUser.getRoles();
			
			//gói các request cũ bởi một Request mới với các thông tin tài khoản + vai trò
			wrapRequest = new UserRoleRequestWrapper(userName, vaitros, request);
		}
		System.out.println("chayvaoday3");
		// các trang bắt buộc phải login
		if(SecurityUtils.isKiemtraTrang(request)) {
			// nếu người dùng chưa login
			// chuyển hướng tới trang đăng nhâp
			if(loginedUser == null) {
				String requestUri = request.getRequestURI();	
				//Lưu trữ trang hiện tại để đến sau khi login thành công
				int redirectId = AppUtils.storeRedirectAfterLoginUrl(request.getSession(),requestUri);
				response.sendRedirect(wrapRequest.getContextPath() + "/login?redirectId="+redirectId);
				return;
			}
			// ktra người dùng có vai trò hợp lệ hay không?
			boolean hasVaitro= SecurityUtils.hasPermission(wrapRequest);
				if(!hasVaitro) {
					RequestDispatcher dispatcher = request.getServletContext().getNamedDispatcher("/JSPFile/Tuchoitruycap.jsp");
					dispatcher.forward(request, response);
					return;
				}
		}
		chain.doFilter(wrapRequest, response);
	}
	@Override
	public void init(FilterConfig fConfig) throws ServletException{
		
	}
}
