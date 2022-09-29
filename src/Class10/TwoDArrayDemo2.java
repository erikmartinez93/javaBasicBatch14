package Class10;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries = {
                {"America","Canada","Mexico","Panama","Costa Rica"},
                {"Brazil","Columbia","Argentina"},
                {"South Africa","Nigeria","Kenya","Ghana"},
                {"India","Nepal","Pakistan","Afganistan","Bangladesh"},
                {"United Kingdom","France"}
        };
        System.out.println(countries.length); // 5 - total # of arrays or rows
        int elementOf1Array = countries[0].length;
        System.out.println("# of elements frome 1 Array: "+elementOf1Array);

        int elementOf2Array = countries[1].length;
        System.out.println("# of elements frome 2 Array: "+elementOf2Array);
        System.out.println();

        System.out.println("--> Getting all values for 2D Arrays <--");
        System.out.println();


        for(int row=0; row<countries.length; row++) {
            System.out.println();
            for(int col =0; col<countries[row].length; col++) {

                System.out.print(countries[row][col]+" ");

            }

            System.out.println();

        }

	}

}
