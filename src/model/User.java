package model;

//Type your code here
public class User{
	String name;
	String email;
	String date;
	String gender;
	public User(String name, String email,String date, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return date;
	}
	public void setDob(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}