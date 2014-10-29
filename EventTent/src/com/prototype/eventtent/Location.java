package com.prototype.eventtent;
public class Location extends BaseModel{
	
	private String LineOne;
	private String LineTwo;
	private String City;
	private String Zip;
	private String State;
	private Double Lat;
	private Double Lon;
	
	public String getLineOne() {
		return LineOne;
	}
	public void setLineOne(String lineOne) {
		LineOne = lineOne;
	}
	public String getLineTwo() {
		return LineTwo;
	}
	public void setLineTwo(String lineTwo) {
		LineTwo = lineTwo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Double getLat() {
		return Lat;
	}
	public void setLat(Double lat) {
		Lat = lat;
	}
	public Double getLon() {
		return Lon;
	}
	public void setLon(Double lon) {
		Lon = lon;
	}
	
	
}
