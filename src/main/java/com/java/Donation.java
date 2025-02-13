package com.java;


public class Donation 
{
	private String fullname,mobileno,address,date,gendar,cardname,cardnumber,cardcvc;

	
	public Donation(String fullname, String mobileno, String address, String date,
			String gendar, String cardname, String cardnumber,
			String cardcvc) {
		super();
		this.fullname = fullname;
		this.mobileno = mobileno;
		this.address = address;
		this.date = date;
		this.gendar = gendar;
		this.cardname = cardname;
		this.cardnumber = cardnumber;
		this.cardcvc = cardcvc;
	}

	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}


	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getCardcvc() {
		return cardcvc;
	}

	public void setCardcvc(String cardcvc) {
		this.cardcvc = cardcvc;
	}

	
	
	
	
}
