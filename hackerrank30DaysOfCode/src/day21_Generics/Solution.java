package day21_Generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

	public <T> void printArray(T[] array) {

		
		Arrays.stream(array).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] nums = new Integer[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
			
		}
		
		int m = scan.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < m; i++) {
			strings[i] = scan.nextLine();
			
		}
		
		Solution solution = new Solution();
		solution.printArray(nums);
		solution.printArray(strings);
		

	}

}
