package day26_NestedLogic;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fine;
		int dayReturn = scan.nextInt();
		int monthReturn = scan.nextInt();
		int yearReturn = scan.nextInt();

		int dayDue = scan.nextInt();
		int monthDue = scan.nextInt();
		int yearDue = scan.nextInt();

		String r = scan.nextLine();
		dayReturn = Integer.parseInt(r.split(" ")[0]);
		monthReturn = Integer.parseInt(r.split(" ")[1]);
		yearReturn = Integer.parseInt(r.split(" ")[2]);

		String d = scan.nextLine();
		dayDue = Integer.parseInt(d.split(" ")[0]);
		monthDue = Integer.parseInt(d.split(" ")[1]);
		yearDue = Integer.parseInt(d.split(" ")[2]);

		if (yearReturn > yearDue)
			fine = 10000;
		else if (yearReturn == yearDue) {
			if (monthReturn > monthDue)
				fine = (monthReturn - monthDue) * 500;
			else if (dayReturn > dayDue)
				fine = (dayReturn - dayDue) * 15;
			else
				fine = 0;
		}

	}

}
