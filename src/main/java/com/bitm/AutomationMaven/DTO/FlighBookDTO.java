package com.bitm.AutomationMaven.DTO;

import java.util.ArrayList;
import java.util.List;

public class FlighBookDTO {
	
	private List<String> fnames=new ArrayList<String>();
	private List<String> lnames=new ArrayList<String>();
	private List<String> meals=new ArrayList<String>();
	
	private String ccard;
	private String number;
	private String edate;
	private String eyear;
	private String frstname;
	private String midname;
	private String lastname;
	private String billadd;
	private String city;
	private String state;
	private String postalcode;
	private String country;
	private String deladd;
	private String delcity;
	private String delstate;
	private String delpost;
	private String delcountry;
	

	public List<String> getFnames() {
		return fnames;
	}
	public void setFname(String fname) {
		this.fnames.add(fname) ;
	}

	public List<String> getLname() {
		return lnames;
	}
	public void setLname(String lname) {
		this.lnames.add(lname);
	}

	public  List<String> getMeal() {
		return meals;
	}
	public void setMeal(String meal) {
		this.meals.add(meal) ;
	}

	public String getCcard() {
		return ccard;
	}
	public void setCcard(String ccard) {
		this.ccard = ccard;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEyear() {
		return eyear;
	}
	public void setEyear(String eyear) {
		this.eyear = eyear;
	}
	public String getFrstname() {
		return frstname;
	}
	public void setFrstname(String frstname) {
		this.frstname = frstname;
	}
	public String getMidname() {
		return midname;
	}
	public void setMidname(String midname) {
		this.midname = midname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBilladd() {
		return billadd;
	}
	public void setBilladd(String billadd) {
		this.billadd = billadd;
	}
	public String getCity() {
		return city;
	}
	public void setBillCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDeladd() {
		return deladd;
	}
	public void setDeladd(String deladd) {
		this.deladd = deladd;
	}
	public String getDelcity() {
		return delcity;
	}
	public void setDelcity(String delcity) {
		this.delcity = delcity;
	}
	public String getDelstate() {
		return delstate;
	}
	public void setDelstate(String delstate) {
		this.delstate = delstate;
	}
	public String getDelpost() {
		return delpost;
	}
	public void setDelpost(String delpost) {
		this.delpost = delpost;
	}
	public String getDelcountry() {
		return delcountry;
	}
	public void setDelcountry(String delcountry) {
		this.delcountry = delcountry;
	}
	@Override
	public String toString() {
		return "FlighBookDTO [fname=" + fnames + ", lname=" + lnames + ", meal=" + meals
				+ ", ccard=" + ccard + ", number=" + number + ", edate="
				+ edate + ", eyear=" + eyear + ", frstname=" + frstname
				+ ", midname=" + midname + ", lastname=" + lastname
				+ ", billadd=" + billadd + ", city=" + city + ", state="
				+ state + ", postalcode=" + postalcode + ", country=" + country
				+ ", deladd=" + deladd + ", delcity=" + delcity + ", delstate="
				+ delstate + ", delpost=" + delpost + ", delcountry="
				+ delcountry + "]";
	}
		
}
