package day09_recursion3;

import java.util.Scanner;

class Result{
	static int factorial(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorial(n-1);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Result.factorial(scan.nextInt());
		System.out.println(n);
		scan.close();
	}
}
