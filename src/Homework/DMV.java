package Homework;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		String name=scanner.nextLine();
		
		System.out.println("Print your age");
		
		int age=scanner.nextInt();
		
		if (age>18) {
			System.out.println("Congrtulations you got your driver's license");
		}else {
			System.out.println("Not old enough for a license");
		}

	}

}
