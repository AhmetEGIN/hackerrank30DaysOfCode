package day03_IntroToConditionalsStatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.close();

		if (N % 2 == 1) {
			System.out.println("Weird");
		} else {
			if (N >= 2 && N <= 5 || N > 20)
				System.out.println("Not Weird");
			else
				System.out.println("Weird");
		}
	}
}
