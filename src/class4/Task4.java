package class4;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		/*
		 * Write a Java program to check number is Even or Odd
		 */
		
		int number=5;
		System.out.println(5%2);
		// if we take the modulus number of a by2 and answer is 0 it is always an Even number
		// otherwise it is an odd number
		
		if(number%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd"); 
		}

	}

}
