package spring_mvc.model;

public class User {
	private String email;
	private String uname;
	private String upassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", uname=" + uname + ", upassword=" + upassword + "]";
	}
	
}
