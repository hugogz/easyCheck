package com.molihugo.easycheck.apis.googleplaces;


public class Location {
	private String lat;
	private String lng;
	
	public String getLat() {
	return lat;
}
public void setLat(String lat) {
	this.lat = lat;
}
public String getLng() {
	return lng;
}
public void setLng(String lng) {
	this.lng = lng;
}
	public Location(String lat, String lng) {
	super();
	this.lat = lat;
	this.lng = lng;
}
	public Location() {
		// TODO Auto-generated constructor stub
	}

}
