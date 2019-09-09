
/**
 * this class sets , gets and validate user.
 * @author a.a.chawla
 * @version 1.0
 * @date of creation : 12/21/2015
 * 
*/
package org.login;


public class LoginBean {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate(){
		if(username=="ashish"&& password=="pass"){
			return true;
		} else {
			return false;
		}
	}
	

}
