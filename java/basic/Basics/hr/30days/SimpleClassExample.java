import java.io.*;
import java.util.*;

public class SimpleClassExample {
    private int age;

	public SimpleClassExample(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if ( initialAge < 0 ) {
			System.out.println("Age is not valid, setting age to 0");
			age = 0;
		} else {
			age = initialAge;
		}
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        	String buffer = new String("You are young.");

		if ( age < 13 ) {
			;
		} else if ( age >= 18 ) {
			buffer = new String("You are old.");
		} else {
			buffer = new String("You are a teenager.");
		}

		
		System.out.println(buffer);
	}

	public void yearPasses() {
  		// Increment this person's age.
		age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			SimpleClassExample p = new SimpleClassExample(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        	}
		
		sc.close();
    	}
}
