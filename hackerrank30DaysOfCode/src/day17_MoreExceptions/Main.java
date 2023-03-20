package day17_MoreExceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			NumberException ne = new NumberException();
			int m = scan.nextInt();
			int p = scan.nextInt();
			try {
				ne.isNumbersNegative(m,p);
				System.out.println(power(m, p));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		scan.close();
		

	}
	public static int power(int n, int p) {
		return (int) Math.pow(n, p);
	}

}


class NumberException{
	public void isNumbersNegative(int n, int p) throws Exception {
		if (n < 0 || p<0) {
			throw new Exception("n and p should be non-negative");
		}
	}
	
}

