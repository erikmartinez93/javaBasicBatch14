package Homework;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scanner.nextLine();
		
		for (int i=1; i<=3; i++) {
			System.out.println("Good afternoon "+name);
		}

	}

}
