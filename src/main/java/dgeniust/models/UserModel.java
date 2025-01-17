package dgeniust.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserModel implements Serializable{
	
	public UserModel(int id, String username, String password, String email, String fullname, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
		this.role = role;
	}
	public UserModel(String username, String email, String password, String fullname, String role) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.role = role;
	}

	public UserModel(String username, String email, String password, String fullname) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.role = "MEMBER";
	}
	public UserModel() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private int id;
	private String username;
	private String password;
	private String email;
	private String fullname;
	private String role;
}
