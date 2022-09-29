package Class12;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Proper way of creating an object
		String str= new String("Java");
		//Simpler and shorter way provided by Java creators to make life a little easier
		String name="Java";
		/*
		 * counts the number of characters in a string including spaces
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		 if(name.length()>15){
	            System.out.println("Name can't be more than 15 characters");
	        }


	}

}
