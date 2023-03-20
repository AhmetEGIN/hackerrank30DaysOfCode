import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] nums = new Integer[n];
		int first = scan.nextInt();
		nums[0] = first;
		
		int small = 0;
		int big = 0;
		
		
		for (int i = 1; i < n; i++) {
			int num = scan.nextInt();
			if (num > solution.getMax(nums)) {
				big ++;
			}
			else if(num < solution.getMin(nums)) {
				small ++;
			}
			nums[i] = num;
			
		}

		scan.close();
		System.out.println("***");
		System.out.println((small>big) ? small : big);
		
	}
	
	public int getMax(Integer[] nums) {
		int max = 0;
		
		for (Integer num : nums) {
			if (num == null) {
				break;
			}
			else if (num > max) {
				max = num;
			}
		}
		
		return max;
		
	}
	public int getMin(Integer[] nums) {
		int min = 0;

		for (Integer num : nums) {
			if (num == null) {
				break;
			}
			else if (num < min) {
				min = num;
			}
		}
		
		return min;
		
	}

}
