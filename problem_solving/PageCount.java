import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PageCount {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {

		int count1 = 0;
		int count2 = 0;

		int printedPages = 0; /* how many pages are in the book */

		if ( n%2==1 )
			printedPages = n + 1;
		else 
			printedPages = n + 2;
		
		for( int i = 0; i < printedPages/2; i++) {

			if ( p == 2*i || p == 2*i + 1 ) {
				count1 = i;
				break;
			}		
		}
		
		for ( int i = printedPages/2 - 1; i >= 0; i -- ) {
			
			if ( p == 2*i || p == 2*i + 1 ) {
				count2 = printedPages/2 -1  - i;
				break;
			}		


		}

		if ( count1 > count2 )
			return count2;

		return count1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        scanner.close();

        System.out.println(pageCount(n, p));


    }
}

