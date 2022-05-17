package ai.jobiak.model;

public class User {
	
	String fname;
	String email;
	String mobile;
	
	public User() {
		
	}

	public User(String name,String mail,String mobile) {
		// TODO Auto-generated constructor stub
		
		this.fname=name;
		this.email=mail;
		this.mobile=mobile;
		
	}
	
	
	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFname() {
	 return this.fname;
	

}
	public String getMobile() {
		return this.mobile;
	}
	public String getEmail() {
	   return this.email;
}
}
