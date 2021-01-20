
public class NestedForDemo {
    public static void main(String[] args) {
        int i, j, result = 0;

        for (i = 1; i <= 12; i++) {
            System.out.println("The number of " + i + " to 12 is :");

            for (j = 1; j <= 12; j++) {
                result = i * j;
                System.out.println(i + "*" + j + " = " + result);
            } // end of loop for(j = 1 ; j <= 12 ; j++)

        } // end of loop for(i = 1 ; i <= 12 ; i++)
    } // end of main method
} // end of class