import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {

	int sizeDistance = 0;
	if ( n < 6 )
		sizeDistance = 6 - n;

	int distance = 4;
	boolean digitFlag = false;
	boolean upperFlag = false;
	boolean lowerFlag = false;
	boolean specialFlag = false;

	for ( int i = 0; i < n; i++ ) {

		if ( digitFlag == false ) {
			String expression = "0123456789";
			if( expression.indexOf(password.charAt(i)) >= 0 ) {
				digitFlag = true;
				distance--;
			}
		}

		if ( upperFlag == false ) {
			String expression = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			if ( expression.indexOf(password.charAt(i)) >= 0 ) {
				upperFlag = true;
				distance--;
			}
		}

		if ( lowerFlag == false ) {
			String expression = "abcdefghijklmnopqrstuvwxyz";
			if ( expression.indexOf(password.charAt(i)) >= 0 ) {
				lowerFlag = true;
				distance--;
			}
		}

		if ( specialFlag == false ) {
			String expression = "!@#$%^&*()-+";
			if ( expression.indexOf(password.charAt(i)) >= 0) {
				specialFlag = true;
				distance--;
			}
		}
	}

	if ( n < 6 ) {
		if ( n - 6 < distance )
			return distance;
		else 
			return 6-n;
	} else {
		return distance;
	}


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

	System.out.println(answer);

        scanner.close();
    }
}

