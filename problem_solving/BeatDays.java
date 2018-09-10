import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeatDays {

    // Complete the beautifulDays function below.
    
    static  int getReverseInt(int value) {
    	int resultNumber = 0;
    	for (int i = value; i !=0; i /= 10) {
        	resultNumber = resultNumber * 10 + i % 10;
    	}
    	return resultNumber;
    }

    static int beautifulDays(int i, int j, int k) {

	    int count = 0;

	    for (int idx = i; idx <=j ; idx++) {

		    if ( Math.abs( idx - getReverseInt(idx))%k==0)
			    count++;

	    }

	    return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        System.out.println(beautifulDays(i, j, k));


        scanner.close();
    }
}

