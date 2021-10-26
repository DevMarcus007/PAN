package Entradas;

import java.util.Scanner;

public class LerScanner {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); //Create a scanner object
		System.out.println("Enter username");
		
		String userName = myObj.nextLine(); //Read user input
				
		Scanner myObj1 = new Scanner(System.in); //Create a scanner object
		System.out.println("Enter age");
		
		String userAge = myObj1.nextLine(); //Read user input
		
		System.out.println("Username is: " + userName); //Output user input
		System.out.println("User Age is: " + userAge); //Output user input
	}

}
 