package model;

import java.text.SimpleDateFormat;
import java.util.Date;

//import controller.AccountController;

public class Account {
	public Account(String account_number, String username_of_account_number, String account_type,
			Date account_opening_date) {
		super();
		this.account_number = account_number;
		this.username_of_account_number = username_of_account_number;
		this.account_type = account_type;
		this.account_opening_date = account_opening_date;
	}
	String account_number;
	String username_of_account_number;
	String account_type; //"Standard" or "Saving"
	Date account_opening_date;
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getUsername_of_account_number() {
		return username_of_account_number;
	}
	public void setUsername_of_account_number(String username_of_account_number) {
		this.username_of_account_number = username_of_account_number;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public Date getAccount_opening_date() {
		return account_opening_date;
	}
	public void setAccount_opening_date(Date account_opening_date) {
		this.account_opening_date = account_opening_date;
	}
	
	public String toString() {
		return account_number + ", " + username_of_account_number + ", " + account_type + ", " + account_opening_date;
	}

}
