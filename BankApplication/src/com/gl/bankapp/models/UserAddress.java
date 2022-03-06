package com.gl.bankapp.models;

public class UserAddress {
    
	private String city;
    private String houseNo;
    private String streetInfo;
    private String landMark;
    private String pinCode;
    private String state;
    private String country;
    
    public UserAddress(String city, String houseNo, String pinCode, String state, String country) {
		super();
		this.city = city;
		this.houseNo = houseNo;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}

	
    public String getCity() {
		return city;
	}
	
    public void setCity(String city) {
		this.city = city;
	}
	
    public String getHouseNo() {
		return houseNo;
	}
	
    public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
    public String getStreetInfo() {
		return streetInfo;
	}
	
    public void setStreetInfo(String streetInfo) {
		this.streetInfo = streetInfo;
	}
	
    public String getLandMark() {
		return landMark;
	}
	
    public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
    public String getPinCode() {
		return pinCode;
	}
	
    public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
    public String getState() {
		return state;
	}
	
    public void setState(String state) {
		this.state = state;
	}
	
    public String getCountry() {
		return country;
	}
	
    public void setCountry(String country) {
		this.country = country;
	}
    
    
}
