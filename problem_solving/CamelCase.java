import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {

       int c = 0;

       if ( s.length() == 0 )
	       return 0;

       for( int i = 0; i < s.length(); i++ ) {

	       if ( Character.isUpperCase( s.charAt(i)) )
		       c++;
       
       }

       
       if ( c == 0 )
	       return 1;

	return c+1;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        System.out.println(camelcase(s));



        scanner.close();
    }
}

