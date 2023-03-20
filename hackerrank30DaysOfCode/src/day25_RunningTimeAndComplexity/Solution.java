package day25_RunningTimeAndComplexity;

import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int i = 0; i < T; i++) {
			int num = scan.nextInt();
			if (num <= 2) {
				System.out.println("Not prime");
			}
			System.out.println((isPrime(num)? "Prime": "Not Prime"));
		}
		
		scan.close();
	}

}
