package dto;

import java.sql.Date;

public class User {

	private String userName;
	private String year;
	private String month;
	private String day;
	private String manOrWoman;
	private String mail;
	private String id;
	private String passWord;

	public User(String name, String year, String month, String day, String manOrWoman, String mail, String id,
			String passWord) {
		this.userName = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.manOrWoman = manOrWoman;
		this.mail = mail;
		this.id = id;
		this.passWord = passWord;
	}

	public Date getBirthday() {
		/*
				String year = "1999";
				String month = "1";
				String day = "1";*/


		Date date = Date.valueOf(year + "-" + month + "-" + day);

		//Date date = Date.valueOf("1999" + "-" + "1" + "-" + "5");


		return date;
	}

	public static void main(String[] args) {

		//System.out.println(getBirthday());

	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getManOrWoman() {
		return manOrWoman;
	}

	public void setManOrWoman(String manOrWoman) {
		this.manOrWoman = manOrWoman;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
