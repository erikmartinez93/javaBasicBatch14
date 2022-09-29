package Class6;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//matching cases must have same data type as a variable
		// no duplicate case in switch
		char choice='Y';
		String answer;
		switch(choice) {
		case'Y':
			answer="Yes";
			break;
		case'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);

	}

}
