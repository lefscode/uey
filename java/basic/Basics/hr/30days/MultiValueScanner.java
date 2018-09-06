import java.util.*;

public class MultiValueScanner {

	public static void main(String[] args) {
	
		int i = 4;
		double d = 4.0;
		String s = "LefsCode ";

		Scanner scan = new Scanner(System.in);
		
		int i2 = scan.nextInt();
		double d2 = scan.nextDouble();
		scan.nextLine();
		String s2 = scan.nextLine();

		System.out.println(i+i2);
		System.out.println(String.format("%.1f", d+d2));
		System.out.println(s+s2);
		scan.close();
	
	}


}
