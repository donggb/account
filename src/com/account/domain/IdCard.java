package com.account.domain;

import java.util.List;

public class IdCard {
	/*
CREATE TABLE IdCard(
  IdCard_id int PRIMARY KEY ,
  IdCard_name VARCHAR(50) NOT NULL ,
  IdCard_idcard VARCHAR(18) NOT NULL 
);
	 */
	private List<User> ulist;
	public List<User> getUlist() {
		return ulist;
	}
	public void setUlist(List<User> ulist) {
		this.ulist = ulist;
	}
	private String name;
	private String idCard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
}
