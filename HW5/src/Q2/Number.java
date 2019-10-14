package Q2;

import java.util.Scanner;

public class Number {
	public static void main(String arg[])
    {  
		Scanner KB=new Scanner(System.in);
		
		
		System.out.print("Enter first number : ");
		int a=KB.nextInt();
   
		System.out.print("Enter second number : ");
		int b=KB.nextInt();
		new Number().count(a, b);
   
		
	}
	public void count(int a, int b){
		try
		{
			int c;
			
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(Exception e){
			System.out.println("Exception Condition Program is ending ");
		}
	}

}
