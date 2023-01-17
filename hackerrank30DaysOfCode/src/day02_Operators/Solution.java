package day02_Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result{
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = (meal_cost * tip_percent) / 100;
 		double tax = (meal_cost * tax_percent) / 100;
 		
 		// Im unten geschriebenen Code runden wir den Total preis ab. Da die Ergebnis der Variable 'total' double wäre,
 		// sollte 'total' in den Datentype int umgewandelt werden.
 		// Wenn wir von einem höher wertigen Datentyp in einen der niedrigen Datentyp umwandeln würden, sollten wir cast-Operator nutzen.
		int total = (int) Math.round(meal_cost + tax + tip);
 		System.out.println(total);
 		
	}
}

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner scan = new Scanner(System.in);
		// Diese Frage könnten auch mit Scanner gelöst werden. Aber in dem Quellcode von HackerRank wird BufferedReader verwendet.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// Mithilfe von .trim() Methode kann man die Leerzeichnen am Anfang oder Ende des Wortes entfernen.
		double mealCost = Double.parseDouble(bufferedReader.readLine().trim());
		int tipPercent = Integer.parseInt(bufferedReader.readLine().trim());
		int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());
//		scan.close();
		Result.solve(mealCost, tipPercent, taxPercent);

	}

}
