package day10_BinaryNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int result = 0;
		
		while (n > 0) {
			if (n % 2 != 0) {
				result +=1;
			}
			else {
				result = 0;
			}
			n = n/2;
			
		}
		
		System.out.println(result);
		
		
//		5 / 2 =  2   1
//		2 / 2 = 1    0
//		1 / 2 = 0    1
//		
//		13 / 2 = 6  1
//		6 / 2 = 3   0
//		3 / 2 = 1   1
//		1 / 2 = 0   1
		

	}

}
