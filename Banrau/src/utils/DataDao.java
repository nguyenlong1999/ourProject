package utils;
// truy vấn csdl
import java.util.HashMap;
import java.util.Map;
import config.SecurityConfig;
import bean.UserAccount;

public class DataDao {
	
	private static final Map<String,UserAccount> mapUsers = new HashMap<String,UserAccount>();
	static {
		initUsers();
	}
	private static void initUsers() {
		//create tk chủ tịch, có 2 vai trò
		UserAccount chutich = new UserAccount("chutich","123",UserAccount.GENDER_FEMALE,SecurityConfig.ChuTich,SecurityConfig.Nguoimua);
		UserAccount nguoimua = new UserAccount("nv1","123",UserAccount.GENDER_MALE,SecurityConfig.Nguoimua);
		mapUsers.put(chutich.getUserName(),chutich);
		mapUsers.put(nguoimua.getUserName(),nguoimua);
	}
	
	// search người dùng theo tk & pass
	public static UserAccount timkiem(String ten,String mk) {
		UserAccount f = mapUsers.get(ten);
		if(f!= null && f.getPassword().equals(mk)) {
			return f;
		}
		return null;
	}
	
}
