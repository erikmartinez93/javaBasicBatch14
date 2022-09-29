package Class5;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean allergy=true;
		
		String allergyType="Pollen";
		
		if(allergy) {
			System.out.println("Lets check what allergy you have");
			
			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			}
		}else {
			System.out.println("You are lucky");
		}

	}

}
