package Q1;

import java.io.Serializable;

public class Userdata extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double availableBalance;
	  private String password;
	  
	  double getAvailableBalance() {
	    return availableBalance;
	  }
	  void setAvailableBalance(double availableBalance) {
	    this.availableBalance = availableBalance;
	  }
	  String getPassword() {
	    return password;
	  }
	  void setPassword(String password) {
	    this.password = password;
	  }
	  
	  protected Userdata(){}
	  
	  Userdata(String name, String phone){
	    super(name,phone);
	  }
	  
	  Userdata(String name, int birthYear, String phone, String card){
	    super(name, phone);
	    super.setBirthYear(birthYear);
	    super.setBankAccountNumber(card);
	    this.availableBalance=0.0;
	  }
	  
	  Userdata(String name, int birthYear, String phone, String card, String password){
	    this(name, birthYear, phone, card);
	    this.password=password;
	  }
	  
	  public String toString(){
	    return super.toString() +", "+password+", "+availableBalance;
	  }
	}

	enum Transaction {
	  WithDrawal("WithDrawal"), Deposit("Deposit");
	  String name;

	  Transaction(String name) {
	    this.name = name;
	  }

	  public String toString() {
	    return String.format("%-10s", this.name);
	  }
	}


