package day14_Scope;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] __elements = new int[n];
		for (int i = 0; i < __elements.length; i++) {
			__elements[i] = scan.nextInt();
		}
		
		scan.close();
		int max = Arrays.stream(__elements).max().getAsInt();
		int min = Arrays.stream(__elements).min().getAsInt();
		System.out.println(max-min);
		
	}
}
