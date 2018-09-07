import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankFind {

     static String hackerrankInString(String s) {
	
	String s1 = "hackerrank";
	char[] hr = s1.toCharArray();
	int idx = 0;
	for( int i = 0; i < s.length() ; i++ ) {

		if ( idx > s1.length() ) 
			break;

		if ( s.charAt(i) == hr[idx] ) {
			idx++;
			if ( idx == s1.length() )
				return "YES";
		}
	}

	if ( idx > 0 && idx > s1.length()  )
		return "YES";

	return "NO";
    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
	
	    System.out.println(result);
        }


        scanner.close();
    }
}

