package day20_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int capacity = scan.nextInt();
		int swap = 0;
//		int[] nums = new int[capacity];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = scan.nextInt();
//		}
//		scan.close();
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums.length - 1; j++) {
//				if (nums[j] > nums[j + 1]) {
//					int temp = nums[j];
//					nums[j] = nums[j + 1];
//					nums[j + 1] = temp;
//					swap++;
//				}
//
//			}
//
//		}
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < capacity; i++) {
			a.add(scan.nextInt());

		}
		
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size() - 1; j++) {
				if (a.get(j) > a.get(j+1)) {
					int temp = a.get(j);
					a.remove(j);
					a.add(j+1, temp);
					swap ++;
				}
				
			}
			
		}
		

		System.out.println("Array is sorted in " + swap + "  swaps.");
		System.out.println("First Element: " + a.get(0) + ".");
		System.out.println("Last Element: " + a.get(a.size() - 1) + ".");

	}

}
