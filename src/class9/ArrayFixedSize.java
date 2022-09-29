package class9;

public class ArrayFixedSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num=new int[3];
		
		num[1]=12;
		num[2]=13;
		
		System.out.println(num[0]);
		
		String[] colors=new String[3];
		
		colors[0]="white";
		colors[1]="pink";
		colors[2]="black";
		colors[3]="yellow"; //ArrayIndexOutOfBoundsException
		

	}

}
