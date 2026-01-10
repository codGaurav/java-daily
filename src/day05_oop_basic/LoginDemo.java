package day05_oop_basic;

class Login{
	private String username;
	private String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		if(password.length() >=6) {
		this.password = password;
		}
	}
	
	public boolean login(String u, String p) {
		return username.equals(u) && password.equals(p);
	}
	
}
public class LoginDemo {
	public static void main(String[] args) {
	Login login = new Login();
	
	login.setUsername("Gaurav");
	login.setPassword("Gaurav@123");
	
	System.out.println(login.login("Gaurav", "Gaurav@123"));
	}
}
