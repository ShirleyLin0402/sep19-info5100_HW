package Q1;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name, address, phoneNumber, bankAccountNumber;
	  private int birthYear;
	  String getName() {
		    return name;
		  }
		  void setName(String name) {
		    this.name = name;
		  }
		  String getAddress() {
		    return address;
		  }
		  void setAddress(String address) {
		    this.address = address;
		  }
		  String getBankAccountNumber() {
		    return bankAccountNumber;
		  }
		  void setBankAccountNumber(String bankAccountNumber) {
		    this.bankAccountNumber = bankAccountNumber;
		  }
		  String getPhoneNumber() {
		    return phoneNumber;
		  }
		  void setPhoneNumber(String phoneNumber) {
		    this.phoneNumber = phoneNumber;
		  }
		  int getBirthYear() {
		    return birthYear;
		  }
		  void setBirthYear(int year) {
		    this.birthYear = year;
		  }
		  
		  protected User(){};
		  User(String name, String phone){
		    this.name=name;
		    this.phoneNumber=phone;
		  }
		  
		  public String toString(){
		    return name+", "+birthYear+", "+phoneNumber+", "+bankAccountNumber+", "+address;
		  }
		}


