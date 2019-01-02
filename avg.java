package firstTry;

import java.util.Scanner;

public class avg {
	public static void main(String[] args)
	{
		System.out.println("Eter 2 numers");
		Scanner in = new Scanner(System.in);
		
		int one = in.nextInt();
		int two = in.nextInt();
		int ans = (one * two) + 2;
		System.out.print("\nYour average is " + ans);
	}

}
