package day01_DataTypes;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		// Zuerst werden die Variablen definiert.
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		// Danach wird ein Instanz von Scanner in Speicher erstellt.
		Scanner scan = new Scanner(System.in);
		int i2;
		double d2;
		String s2;
		
		// Hier werden die Werte von Integer, Double und String gelesen und in unseren Variablen gespeichert.
		i2 = scan.nextInt();
		d2 = scan.nextDouble();
		scan.nextLine();
		s2 = scan.nextLine();
		scan.close();
		
		// In den kommenden Kodierung werden die Summe der Variablen in console ausgedrückt.
		System.out.println(i + i2);
		System.out.println(d + d2);
		System.out.println(s + s2);
		// String Variablen können auf zwei verschiedene Arten gesammelt werden= + Operatur oder .concat()
		System.out.println(s.concat(s2));
		
	}
}
