package com.sjf.bean;
/**
 * Address实体类
 * @author sjf0115
 *
 */
public class Address {
	private int ID;
	private String country;
	private String province;
	private String city;
	private String street;
	
	public int getID() {
		return ID;
	}
	public void setID(int addressID) {
		this.ID = addressID;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "[ ID：" + ID + "   country：" + country + "   province：" + province + "   city：" + city +"   street：" + street +" ]";
	}
}
