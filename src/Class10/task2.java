package Class10;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// from array of integer elements find the largest number.
		
		int[] num = {10,20,30,40,50};
        int largestnum = 0;

        for (int i=0 ; i<num.length ; i++ ) {
            if (num[i]>largestnum) {
              largestnum=num[i];
            }

        }
        System.out.println(largestnum);
        
        System.out.println("---------------------");
        
        largestnum= num[0];
        for (int n:num) {
        	if(n>largestnum) {
        		largestnum=n;
        	}
        	System.out.println(largestnum);
        }

	}
	
	

}
