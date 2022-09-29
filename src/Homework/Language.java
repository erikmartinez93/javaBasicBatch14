package Homework;

import java.util.Scanner;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please tell me your country?");
		String country=scanner.nextLine();
		String Language = null;
		
		switch(country) {
		
		case"USA":
			Language="English";
			break;
		case"El Salvador":
			Language="Spanish";
			break;
		case"Germany":
			Language="German";
			break;
		case"Japan":
			Language="Japanese";
			break;
		case"India":
			Language="Hindi";
			break;
		case"Pakistan":
			Language="Urdu";
			break;
		
		}
		System.out.println("Your are from "+country+" and you speak "+Language); 
		

	}

}
