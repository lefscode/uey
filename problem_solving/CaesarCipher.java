import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

	    StringBuffer b = new StringBuffer(s);


	    for ( int i = 0; i < b.length(); i++ ) {

		    if ( Character.isLetter( b.charAt(i)) ) {
	
	    		final int alphaLength = 26;
			final char asciiShift = Character.isUpperCase(b.charAt(i)) ? 'A' : 'a';
			final int cipherShift = k % alphaLength;
	
			char shifted = (char) (b.charAt(i) - asciiShift);
        		shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);
        		//return (char) (shifted + asciiShift);


			b.setCharAt(i, (char)(shifted + asciiShift));

		    }
	    }


	    return b.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

	System.out.println(result);

        scanner.close();
    }
}

