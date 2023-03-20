package day16_Exceptions_StringToInteger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		
		try {
			int n = Integer.parseInt(S);
			System.out.println(n);
			
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
		
	}

}
