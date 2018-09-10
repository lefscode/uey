import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {


	    StringBuilder t = new StringBuilder(s);
	    
	    boolean stop = false;	

	    while ( !stop ) {

		    //System.out.println( t.toString());

		    if ( t.length() == 0 ) {
			return "Empty String";
		    }

		    if ( t.length() == 1 ) {
			    return t.toString();
		    }

		    if ( t.length() == 2 ) {

		    		if ( t.charAt(0) != t.charAt(1) ) {
					return t.toString();
				}
		    }


		    for ( int i = 0; i < t.length(); i++ ) {

			    if ( i == t.length() - 1 ) {
				stop = true;	
				break;
			    }

			    if ( t.charAt(i) == t.charAt(i+1) ) {
				//System.out.println("Deleting... at " + i + " new length is: " + t.length());
				t.deleteCharAt(i+1);
				t.deleteCharAt(i);
				break;
			    }

		    }

	    }


	    return t.toString(); 


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

	System.out.println("Result is:" + result);

        bufferedReader.close();
    }
}

