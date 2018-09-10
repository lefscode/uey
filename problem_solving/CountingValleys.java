import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

	boolean isCrossingValley = false; //
	int height = 0;
	int count = 0;

	for ( int i = 0; i < n; i++ ) {

		int previousHeight = height;

		if ( s.charAt(i) == 'D' ) 
			height--;
		else 
			height++;

		if ( previousHeight == 0 && height == -1 ) {
			isCrossingValley = true;
			count++;
			continue;
			
		}

		if ( previousHeight == 0 && height == 1 ) {

			isCrossingValley = false;
			continue;
		}

	}

	return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

	System.out.println(result);

        scanner.close();
    }
}

