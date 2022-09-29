package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /*
         * Using Scanner create an array of countries. When an array is created,
         * retrieve all values from it and while retrieving those values print capital
         * for each country. (use 2 different loops)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter how many countries you want to process");
        int size=scanner.nextInt();
        //Two arrays one to store the countries and the other one to store the capitals
        String [] countries=new String[size];
        String [] capitals=new String[size];
        
        // this is just to consume that extra enter that will be getting from line number 18
        scanner.nextLine();
        
        for(int i=0;i<size;i++) {
            System.out.println("Please Enter the country name");
            countries[i]=scanner.nextLine();

            System.out.println("Please Enter the capital for "+countries[i]);
            capitals[i]=scanner.nextLine();
        }

        System.out.println(Arrays.toString(countries));
        System.out.println(Arrays.toString(capitals));


	}

}
