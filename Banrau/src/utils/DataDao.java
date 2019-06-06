package utils;
// truy vấn csdl
import java.util.HashMap;
import java.util.Map;
import config.Cauhinhvaitro;
import bean.taikhoan;

public class DataDao {
	
	private static final Map<String,taikhoan> mapTaikhoan = new HashMap<String,taikhoan>();
	static {
		initUsers();
	}
	private static void initUsers() {
		//create tk chủ tịch, có 2 vai trò
		taikhoan chutich = new taikhoan("chutich","123",taikhoan.GENDER_FEMALE,Cauhinhvaitro.ChuTich,Cauhinhvaitro.Nguoimua);
		taikhoan nguoimua = new taikhoan("nv1","123",taikhoan.GENDER_MALE,Cauhinhvaitro.Nguoimua);
		 mapTaikhoan.put(chutich.getTaikhoan(),chutich);
		 mapTaikhoan.put(nguoimua.getTaikhoan(),nguoimua);
	}
	
	// search người dùng theo tk & pass
	public static taikhoan timkiem(String ten,String mk) {
		taikhoan f = mapTaikhoan.get(ten);
		if(f!= null && f.getMatkhau().equals(mk)) {
			return f;
		}
		return null;
	}
	
}
