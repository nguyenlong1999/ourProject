package request;


import java.util.List;
import java.io.IOException;
import java.security.Principal;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Vaitronguoidungyeucau extends HttpServletRequestWrapper {
	
	private String taikhoan;
	private List<String> vaitros = null;
	private HttpServletRequest realRequest;
	
	public Vaitronguoidungyeucau(String tk,List<String> vtro,HttpServletRequest request)
	{
		super(request);
		this.taikhoan = tk;
		this.vaitros = vtro;
		this.realRequest = request;
	}
	
	
	@Override
	public boolean isUserInRole(String vaitro) {
		if(vaitros == null) {
			return this.realRequest.isUserInRole(vaitro);
		}
		return vaitros.contains(vaitro);
	}
	
	
	
	@Override
	public Principal getUserPrincipal() {
        if (this.taikhoan == null) {
            return realRequest.getUserPrincipal();
        }
     
        return new Principal() {
        	@Override
            public String getName() {
                return taikhoan;
            }
        };
	}
}
