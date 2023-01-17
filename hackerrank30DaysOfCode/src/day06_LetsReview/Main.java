package day06_LetsReview;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i <= N; i++) {
//			Scanner sc = new Scanner(System.in);
			String S = scan.nextLine();
//			sc.close();
			char[] charsOfString = S.toCharArray();

			for (int j = 0; j < charsOfString.length; j++) {
				if (j % 2 == 0) {
					System.out.print(charsOfString[j]);
				}
			}
			System.out.print(" ");
			for (int j = 0; j < charsOfString.length; j++) {
				if (j % 2 != 0) {
					System.out.print(charsOfString[j]);
				}
			}
			System.out.println();
		}
		scan.close();

	}

}
