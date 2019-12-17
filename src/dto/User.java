package dto;

import java.sql.Date;

public class User {

	private int userNo;
	private String userName;
	private String year;
	private String month;
	private String day;
	private String manOrWoman;
	private String mail;
	private String id;
	private String passWord;
	private int userRank;
	private Date registrationDate;
	private Date birthday;

	//新規登録用のコンストラクタ
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

	//ログイン時データ獲得するためのコンストラクタ
	public User(int userNo , String name, Date birthday , String manOrWoman, String mail, String id, String passWord ) {

		this.userNo = userNo;
		this.userName = name;
		this.manOrWoman = manOrWoman;
		this.mail = mail;
		this.id = id;
		this.passWord = passWord;
	}

	public User(String id, String passWord) {
		this.id = id;
		this.passWord = passWord;
	}

	public Date getBirthday() {

		Date date = Date.valueOf(year + "-" + month + "-" + day);

		return date;
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

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getBirthdayonDate() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getUserRank() {
		return userRank;
	}

	public void setUserRank(int userRank) {
		this.userRank = userRank;
	}


}
