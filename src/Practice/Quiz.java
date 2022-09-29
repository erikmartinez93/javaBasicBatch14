package Practice;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String instructor;
		String assignment;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		instructor=scanner.nextLine();

		switch(instructor){
		    
		  case "Asghar":
		    assignment = "Will take care of Java Assignment";
		    break;
		  case "Moazzam":
		    assignment = "Will take care of SDLC Assignment";
		    break;
		  case "Weqas":
		    assignment = "Will take care of Selenium Assignment";
		    break;
		  case "Asel":
		    assignment = "Will take care of every Assignment";
		    break;
		  default:
		    assignment = "Invalid instructor selected";
		    break;

		    
		    
		}
		System.out.println(assignment);



		    
		}
		}
