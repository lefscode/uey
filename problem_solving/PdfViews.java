import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PdfViews {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

	    int a = 'a';

	    int tallest = 0;
	    int count = 0;

	    for ( int i = 0; i < word.length(); i++ ) {

		count++;

		int x = word.charAt(i);

		int y = x - a;

		if ( h[y] > tallest )
			tallest = h[y];
	    }


	    return tallest*count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        System.out.println(designerPdfViewer(h, word));


        scanner.close();
    }
}

