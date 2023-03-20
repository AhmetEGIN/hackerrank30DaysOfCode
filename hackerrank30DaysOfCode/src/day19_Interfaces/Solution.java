package day19_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getSimpleName());
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(calculator.divisorSum(n));
		
		scan.close();

	}

}

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		List<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisors.add(i);
			} else {
				continue;
			}
		}

		return divisors.stream().reduce(0, (prev, curr) -> prev + curr);
	}

}
