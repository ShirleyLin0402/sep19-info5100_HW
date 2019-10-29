package Q1;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

public class Test {
	public static void main(String arg[]) {
		ATM atm=new ATM(10000, 1, false, false);
		Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");
		atm.register(user);
	    String info=user.toString();
	    System.out.println(info.equals(atm.getCustomers().get(user.getBankAccountNumber()).toString()));
	}
	
	   
	  
	 public void login(){
		    ATM atm=new ATM(10000, 1, false, false);
			Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");
		    atm.register(user);
		    System.out.println(atm.login(user.getPhoneNumber(), user.getPassword()));
		    }

	    
	    
	public void deposit(){
	    ATM atm=new ATM(10000, 1, false, false);
		Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");
	    atm.register(user);
	    double money = 100+atm.getTransactionFee();
	    atm.deposit(user, money);
	    double balance=atm.getCustomers().get(user.getBankAccountNumber()).getAvailableBalance();
	    System.out.println( balance == money-atm.getTransactionFee());
	    
	    }
	    
	    
	    
	  public void resetPassword(){
	    ATM atm=new ATM(10000, 1, false, false);
		Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");
	    atm.register(user);
	    String newPassword="IamBin";
	    atm.resetPassword(user.getName(), user.getBirthYear(), user.getPhoneNumber(), newPassword);
	    System.out.println(newPassword.equals(atm.getCustomers().get(user.getBankAccountNumber()).getPassword()));
	    }
	

	 
	  public void showRecentTransactions(){
		ATM atm=new ATM(10000, 1, false, false);
	    Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");
//	    no transaction
	    atm.register(user);
	    List<String> trans=ATM.getTransactions().get(user.getBankAccountNumber());
	    Assert.assertTrue("No transactions.", trans==null || trans.isEmpty());
	    
//	    a few transactions less than the default displaying number
	    double money=100;
	    atm.deposit(user, 3*money);
	    atm.withDrawal(user, money);
	    atm.withDrawal(user, money);
	    atm.recentTransactions(user);
	    Assert.assertFalse(ATM.getTransactions().get(user.getBankAccountNumber()).isEmpty());
	    

	    for (int i = 100; i <= 1000; i+=100) {
	      atm.deposit(user, i);
	      atm.withDrawal(user, i);
	    }
	    atm.recentTransactions(user);
	  }

	  public void availableAmountInMachine(){
		ATM atm=new ATM(10000, 1, false, false);
	    Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");

	    double amount=atm.getAvailableAmountInMachine();
	    double money=100;
	    atm.deposit(user, money);
	    double expected=amount+money;
	    double actual=atm.getAvailableAmountInMachine();
	    System.out.println(expected);
	    System.out.println(actual);
	    Assert.assertTrue("new balance should equal (old balance+depoit)",expected==actual);
	    

	    money=10;
	    amount=atm.getAvailableAmountInMachine();
	    atm.withDrawal(user, money);
	    expected=amount-money;
	    actual=atm.getAvailableAmountInMachine();
	    System.out.println(expected+","+actual);
	    Assert.assertTrue("new balance should equal (old balance-withdrawal)",expected==actual);
	  }
	 


	  public void saveData() throws ClassNotFoundException, IOException{
	    ATM atm=new ATM(10000, 1, false, false);
		Userdata user=new Userdata("Bin", 1985, "2068180000", "44006645", "NewBin");
	    atm.register(user);
	    ATM.saveData();

	  }
	  

	  public void loadData() throws ClassNotFoundException, IOException {
	    ATM.loadData();
	    System.out.println(ATM.customers);
	  }

	}
