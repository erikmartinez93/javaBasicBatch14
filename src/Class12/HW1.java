package Class12;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that reads two people's first
			names and if they expecting boy or girl? 
			Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY
		 */
		
		String momsName="Mary";
		String dadsName="Daniel";
		String gender;
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter mom's first name");
		momsName=scanner.next();
		System.out.println("Please enter dad's first name");
		dadsName=scanner.next();
		System.out.println("Baby's gender");
		gender=scanner.next();
		
		if(gender.equals("Boy")) {
			System.out.println(dadsName.substring(0,(dadsName.length()/2))+momsName.substring(momsName.length()/2));
		}else if(gender.equals("Girl")) {
			System.out.println(momsName.substring(0,(momsName.length()/2))+dadsName.substring(dadsName.length()/2));
		}
		
		
		

	}

}
