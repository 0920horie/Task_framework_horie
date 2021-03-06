package jp.co.example.entity;

public class UserEntity {

	private String user_id;
	private String user_name;
	private String telephone;
	private String password;

	public UserEntity() {

	}

	public UserEntity(String user_id, String user_name, String telephone) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.telephone = telephone;
	}

	public UserEntity(String user_id, String user_name, String telephone, String password) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.telephone = telephone;
		this.password = password;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
