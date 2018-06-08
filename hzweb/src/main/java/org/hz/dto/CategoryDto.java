package org.hz.dto;

import java.util.Date;

public class CategoryDto {

	private int id;
	private String name;
	private String address;
	private String idCard;
	private Date birthday;

	
	public int getId() {
		return id;
	}

	public void setId(int id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name ) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address ) {
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard ) {
		this.idCard = idCard;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday ) {
		this.birthday = birthday;
	}


	
}
