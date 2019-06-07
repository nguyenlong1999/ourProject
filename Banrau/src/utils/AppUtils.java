package utils;
import java.util.HashMap;
import java.util.Map;
 
import javax.servlet.http.HttpSession;
 
import bean.taikhoan;;
public class AppUtils {

	private static int REDIRECT_ID = 0;
	
	private static final Map<Integer,String> id_uri_map = new HashMap<Integer,String>();
	private static final Map<String,Integer> uri_id_map = new HashMap<String,Integer>();
	
	//Lưu thông tin người dùng vào Session
	
	public static void storeLoginedUser(HttpSession session, taikhoan login) {
		// trên jsp có thể truy cập thông qua ${login}
		session.setAttribute("login", login);
	}
	
	// Lấy thông tin người dùng ở Session
	public static taikhoan getLoginUser(HttpSession session) {
		taikhoan loginedUser = (taikhoan) session.getAttribute("login");
		return loginedUser;
	}
	
	public static int storeRedirectAfterLoginUrl(HttpSession session,String requestUri) {
	
		Integer id = uri_id_map.get(requestUri);
		
		if(id==null) {
			id = REDIRECT_ID++;
			
			uri_id_map.put(requestUri,id);
			id_uri_map.put(id,requestUri);
			
			return id;
		}
		return id;
	}
	public static String getRedirectAfterLoginUrl(HttpSession session,int redirectId) {
		String url = id_uri_map.get(redirectId);
		if(url != null) {
			return url;
		}
		return null;
		
	}
	
	
}
