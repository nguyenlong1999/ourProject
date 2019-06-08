package servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import bean.UserAccount;
import utils.AppUtils;
import utils.DataDao;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
		  private static final long serialVersionUID = 1L;
		  
		    public LoginServlet() {
		        super();
		    }
		 
		    @Override
		    protected void doGet(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
		 
		        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/JSPFile/DangNhapPage.jsp");
		 
		        dispatcher.forward(request, response);
		    }
		 
		    @Override
		    protected void doPost(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
		 
		        String userName = request.getParameter("userName");
		        String password = request.getParameter("password");
		        UserAccount userAccount = DataDao.timkiem(userName, password);
		        
		        if (userAccount == null) {
		            String errorMessage = "Mời bạn nhập Tài khoản và Mật khẩu";
		            System.out.println("chayvaoday5");
		            request.setAttribute("errorMessage", errorMessage);
		 
		            RequestDispatcher dispatcher= this.getServletContext().getRequestDispatcher("/login");
		 
		            dispatcher.forward(request, response);
		            return;
		        }
		        AppUtils.storeLoginedUser(request.getSession(), userAccount);
		        int redirectId = -1;
		        try {
		            redirectId = Integer.parseInt(request.getParameter("redirectId"));
		        } catch (Exception e) {
		        }
		        String requestUri = AppUtils.getRedirectAfterLoginUrl(request.getSession(), redirectId);
		        if (requestUri != null) {
		            response.sendRedirect(requestUri);
		        } else {
		            // Mặc định sau khi đăng nhập thành công
		            // chuyển hướng về trang /thongtinnguoidung
		            response.sendRedirect(request.getContextPath() + "/thongtinnguoidung");
		        }
		    }
}
