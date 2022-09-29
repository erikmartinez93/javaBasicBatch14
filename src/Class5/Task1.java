package Class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");
		double height=scan.nextDouble();
		if (height<60){
			System.out.println("short");
		}else if(height>60 || height<=72) {
			System.out.println("medium");
		}else if(height>72) {
			System.out.println("Your height is tall");
		}else {
			System.out.println("Your height is not normal");
		}
		
		
		
		
		

	}

}
