package day07_Arrays;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int size = scan.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			int n = scan.nextInt();
			array[i] = n;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[array.length-i-1]);
		}
		scan.close();
		
	}
}
