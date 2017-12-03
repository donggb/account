package com.account.domain;

import java.util.List;

public class User {
	/*
	 * 
CREATE TABLE User(
  U_ID int PRIMARY KEY AUTO_INCREMENT,
  U_USERNAME VARCHAR(100),
  U_PHONE VARBINARY(11) NOT NULL
);
	 */
	private Integer id;
	private String username;
	private String phone;
	private List<Alipay> alipay;
	private List<IdCard> idCard;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Alipay> getAlipay() {
		return alipay;
	}
	public void setAlipay(List<Alipay> alipay) {
		this.alipay = alipay;
	}
	public List<IdCard> getIdCard() {
		return idCard;
	}
	public void setIdCard(List<IdCard> idCard) {
		this.idCard = idCard;
	}
}
