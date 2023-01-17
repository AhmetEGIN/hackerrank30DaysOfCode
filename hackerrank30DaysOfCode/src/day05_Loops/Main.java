package day05_Loops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		for (int i = 1; i <= 10; i++) {
			int mul = n *i;
			System.out.println(n + " x " + i + " = " +mul);
		}

	}

}
