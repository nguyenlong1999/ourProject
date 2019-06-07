package utils;
// kiểm tra yêu cầu có bắt buộc phải login hay không 
//, & phù hợp với vai trò đăng nhập hay không

import java.util.Set;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import config.Cauhinhvaitro;
public class Baomat {
//ktra có bắt buộc phải đăng nhập?
	public static boolean isKiemtraTrang(HttpServletRequest request) {
				String urlPattern = UrlPatternUtils.getUrlPattern(request);
				
				Set<String> vaitros = Cauhinhvaitro.getAllAppVaitro();
		
		for (String vaitro : vaitros) {
			List<String> urlPatterns = Cauhinhvaitro.getUrlPatternsForVaitro(vaitro);
			if (urlPatterns != null && urlPattern.contains(urlPattern)) {
				return true;
			}
		}
		return false;
		
	}
	// ktr yêu cầu này có vai trò phù hợp hay không?
	public static boolean hasVaitro(HttpServletRequest request) {
		String urlPattern = UrlPatternUtils.getUrlPattern(request);
		Set<String> allvaitro = Cauhinhvaitro.getAllAppVaitro();
		for(String vaitro: allvaitro) {
			if (!request.isUserInRole(vaitro)) {
				continue;
			}
			List<String> urlPatterns = Cauhinhvaitro.getUrlPatternsForVaitro(vaitro);
			if (urlPatterns != null && urlPattern.contains(urlPattern) ) {
				return true;
			}
		}
		return false;
	}
}
