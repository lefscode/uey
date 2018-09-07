import java.io.*;
import java.util.*;

public class SimpleReview1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		while ( count > 0 ) {
			
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2= new StringBuilder();

			String s = scan.nextLine();
			

			count--;
			
			for( int i = 0; i < s.length(); i++ ) {
				if ( i%2 == 0 ) {
					sb1.append(s.charAt(i));
				} else {
					sb2.append(s.charAt(i));

				}
			}
			System.out.println(sb1.toString() + " " + sb2.toString());
		}
		

	    	scan.close();
    	}
}
