package Homework;

public class oddLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		
		while(num<=50) {
			System.out.println(num+" ");
			num+=2;
		}
		System.out.println("-------------------");
		
		int num1=21;
		
		while(num1<=50) {
			if(num1 %2==1) {
				System.out.println(num1+" ");
			}
			num1++;
		}
	}

}
