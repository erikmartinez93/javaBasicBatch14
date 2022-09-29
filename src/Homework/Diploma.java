package Homework;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a diploma? please enter True or False");
		
		boolean diploma = scanner.nextBoolean ();
		
		if (diploma) {
			System.out.println("We want to congragulate you!");
			System.out.println("Whats your gpa score?");
		
		float gpa = scanner.nextFloat ();
		
		if (gpa>=3.5) {
			System.out.println("You are elgible for a scolarship");
		}else if (gpa<3.5) {
			System.out.println("You should have studied harder");
		}else {
			System.out.println("we suggest to get a degree");
		}
		}

	}

}
