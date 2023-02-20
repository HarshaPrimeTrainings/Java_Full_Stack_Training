

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		 String number1 = sc.nextLine();
		 int a = Integer.parseInt(number1);
		 
		 System.out.println("Enter number 2");
		 String number2 = sc.nextLine();
		 int b = Integer.parseInt(number2);
		 
		 int res =  a/b; 
		 
		System.out.println("Division of " + number1 + " & " + number2 + ":: " + res);
		
		System.out.println("Hello How are you !! ");
		
		System.out.println("Hello there !! ");
		
		System.out.println("Hello is there anyone !! ");
	}
}
