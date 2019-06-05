package bean;

import java.util.ArrayList;
import java.util.List;

public class taikhoan {
	public static final String GENDER_MALE = "NAM";
	public static final String GENDER_FEMALE = "NU";
	 
	   private String taikhoan;
	   private String tuoi;
	   private String matkhau;
	 
	   private List<String> vaitro;
	 
	   public taikhoan() {
	 
	   }
	   public taikhoan(String taikhoan, String matkhau, String tuoi, String... vaitro) {
		   this.taikhoan =taikhoan;
		   this.tuoi = tuoi;
		   this.matkhau = matkhau;
		   this.vaitro = new ArrayList<String>(); 
		   	if(vaitro!=null) {
		   		for (String v : vaitro) {
					this.vaitro.add(v);
				}
		   	}	 
	   }
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public List<String> getVaitro() {
		return vaitro;
	}
	public void setVaitro(List<String> vaitro) {
		this.vaitro = vaitro;
	}
	   
}

