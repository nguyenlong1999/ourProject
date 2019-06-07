package config;
//cấu hình các vai trò và các chức năng(các trang) được phép truy cập ứng dụng với vai trò đó
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cauhinhvaitro {

	 public static final String ChuTich = "Chutich";
	 public static final String Nguoimua = "Nguoimua";
	 
	 private static final Map<String,List<String>> mapConfig = new HashMap<String,List<String>>();
	 
//	 static {
//		 init{};
//	 }
	 
	 private static void init() {
//Cấu hình vai trò cho chủ tịch
		 List<String> urlPatterns1 = new ArrayList<String>();
		 
		 urlPatterns1.add("/thongtinnguoidung");
		 urlPatterns1.add("/giamdoc");
		 mapConfig.put(ChuTich,urlPatterns1);
//cấu hình vai trò người mua
		 List<String> urlPatterns21 = new ArrayList<String>();
		 
		 urlPatterns1.add("/thongtinnguoidung");
		 urlPatterns1.add("/nhanvien");
		 mapConfig.put(Nguoimua,urlPatterns21);
		 
	 }
	 public static Set<String> getAllAppVaitro(){
		 return mapConfig.keySet();
	 }
	 
	 public static List<String> getUrlPatternsForVaitro(String vaitro){
		 return mapConfig.get(vaitro);
	 }
	 
}
