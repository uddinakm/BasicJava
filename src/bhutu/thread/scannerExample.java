package bhutu.thread;

import java.util.Scanner;

public class scannerExample {

	public static void main(String[] args) {
		// demonstrate scanner for input output 
		
		System.out.println("Enter your name");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		
		System.out.println("Your name is: " +name);
		

		String age=scan.nextLine();
		
		System.out.println("Your age  is: " +age);
		
	}

}
