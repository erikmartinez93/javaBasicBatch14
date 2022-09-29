package Homework;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Whats the amount loan needed?");
		
		int loan=scanner.nextInt ();
		if (loan<=2000000) {
			System.out.println("You are eligible to get a loan");
		}else {
			System.out.println("Unfortunately we cannot approve you");
		}

	}

}
