package Homework;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double price=9.99;
		
		while(price>=0) {
			System.out.println("Please pay for your coffee");
			double pay=scanner.nextDouble();
			
			if(pay>price) {
				System.out.println("Please give less money");
			}else if(pay<price) {
				System.out.println("Please give more money");
			}else {
				System.out.println("Please enjoy your coffee");
				break;
			}
		}

	}

}
