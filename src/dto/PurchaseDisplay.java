package dto;

import java.sql.Date;

public class PurchaseDisplay {

	private int productId;
	private String productName; /*商品名*/
	private String productImg; /*商品画像*/
	private int categoryId; /*カテゴリId 外部キー参照*/
	private String categoryName; /*カテゴリの名前*/
	private String productStatus;/*状態*/
	private String description;/*説明*/
	private String postage;/*送料負担*/
	private String shippingOrigin;/*発送元*/
	private String shipping_method;/*配送方法*/
	private int exhibition_period;/*出品期間*/
	private int price; /*価格*/

	private int userNo;
	private String userName;
	private String year;
	private String month;
	private String day;
	private String manOrWoman;
	private String mail;
	private String id;
	private String passWord;
	private Date registrationDate;
	private Date birthday;



	public PurchaseDisplay(User user , Product product , String categoryName) {

		this.productId = product.getProductId();
		this.productName = product.getProductName();
		this.productImg = product.getProductImg();
		this.categoryId = product.getCategoryId();
		this.categoryName = categoryName;
		this.productStatus = product.getProductStatus();
		this.description = product.getDescription();
		this.postage = product.getPostage();
		this.shippingOrigin = product.getShippingOrigin();
		this.shipping_method = product.getShipping_method();
		this.price = product.getPrice();
		this.exhibition_period = product.getExhibition_period();


		this.userNo = user.getUserNo();
		this.userName = user.getUserName();
		this.manOrWoman = user.getManOrWoman();
		this.mail = user.getMail();
		this.id = user.getId();
		this.passWord = user.getPassWord();
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductImg() {
		return productImg;
	}



	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	public String getProductStatus() {
		return productStatus;
	}



	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getPostage() {
		return postage;
	}



	public void setPostage(String postage) {
		this.postage = postage;
	}



	public String getShippingOrigin() {
		return shippingOrigin;
	}



	public void setShippingOrigin(String shippingOrigin) {
		this.shippingOrigin = shippingOrigin;
	}



	public String getShipping_method() {
		return shipping_method;
	}



	public void setShipping_method(String shipping_method) {
		this.shipping_method = shipping_method;
	}



	public int getExhibition_period() {
		return exhibition_period;
	}



	public void setExhibition_period(int exhibition_period) {
		this.exhibition_period = exhibition_period;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getUserNo() {
		return userNo;
	}



	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
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



	public Date getRegistrationDate() {
		return registrationDate;
	}



	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}





}
