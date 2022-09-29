package class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=9;
		String day="Monday";
		/*
		 * it is called outer if-condition if it is true then only inner conditions will be checked
		 * false nothing from inner if condition will be executed it is like the main door
		 * if main door is closed we can't enter the building
		 */
		//Outer if-conditions
		if(day.equals("Monday")) {// as string is a non primitive we can't use == sign we have to use .equals method
		
			//inner if-conditions
			if(time>7) {
				System.out.println("Lets go to office");
			}
		}
		
		if(time<6) {
			System.out.println("Lets sleep more");
		}
	}

}
