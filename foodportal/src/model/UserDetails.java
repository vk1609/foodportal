package model;

public class UserDetails {
	private String userName;
	private String city;
	private String eMail;
	private String gender;
	private String mNumber;




	public UserDetails(String userName, String city, String eMail, String gender, String mNumber) {
		super();
		this.userName = userName;
		this.city = city;
		this.eMail = eMail;
		this.gender = gender;
		this.mNumber = mNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getmNumber() {
		return mNumber;
	}
	public void setmNumber(String mNumber) {
		this.mNumber = mNumber;
	}

	}



