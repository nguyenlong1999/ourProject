package bean;

	import java.util.ArrayList;
	import java.util.List;

	public class UserAccount {
		public static final String GENDER_MALE = "NAM";
		public static final String GENDER_FEMALE = "NU";
		 
		   private String userName;
		   private String gender;
		   private String password;
		 
		   private List<String> roles;
		 
		   public UserAccount() {
			   
		   }
		   
		   public UserAccount(String taikhoan, String matkhau, String tuoi, String... vaitro) {
			   this.userName =taikhoan;
			   this.gender = tuoi;
			   this.password = matkhau;
			   this.roles = new ArrayList<String>(); 
			   System.out.println("chayvaoday2");
			   	if(vaitro!=null) {
			   		for (String v : vaitro) {
						this.roles.add(v);
					}
			   	}	 
		   }

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<String> getRoles() {
			return roles;
		}

		public void setRoles(List<String> roles) {
			this.roles = roles;
		}
		   
		
	}
