package Class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your birthday month");
		int number=scanner.nextInt();
		if (number == 3 || number == 4 || number == 5) {
			System.out.println("Spring");
		}else if (number == 6 || number == 7 || number == 8) {
			System.out.println("Summer");
		}else if (number == 9 || number == 10 || number == 11) {
			System.out.println("Fall");
		}else if (number == 12 || number == 1 || number == 2) {
			System.out.println("Winter");
		}else {
			System.out.println("Invalid");
		}
		

	}

}
