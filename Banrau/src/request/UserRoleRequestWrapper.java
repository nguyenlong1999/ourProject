package request;

import java.security.Principal;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class UserRoleRequestWrapper extends HttpServletRequestWrapper {
	private String user;
	private List<String> roles = null;
	private HttpServletRequest realRequest;
	
	public UserRoleRequestWrapper(String tk,List<String> vtro,HttpServletRequest request)
	{
		super(request);
		this.user = tk;
		this.roles = vtro;
		this.realRequest = request;
		System.out.println("chayvaoday4");
	}
	
	
	@Override
	public boolean isUserInRole(String vaitro) {
		if(roles == null) {
			return this.realRequest.isUserInRole(vaitro);
		}
		return roles.contains(vaitro);
	}
	
	
	
	@Override
	public Principal getUserPrincipal() {
        if (this.user == null) {
            return realRequest.getUserPrincipal();
        }
     // trả lại đúng người dùng
        return new Principal() {
        	@Override
            public String getName() {
                return user;
            }
        };
	}
}
