package day00_HelloWorld;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner class'�n�n bir instance'�n� olu�turduk.
		// Scanner input almak i�in kullan�l�r.
		String inputString = scan.nextLine();  // input ta bulunan veriyi inputString ad�ndaki variable' a kaydeder.
		//Scan class �ndan olu�turdu�umuz instance ile i�imiz bitti. 
		// Bellekte gereksiz yer kaplamamas� i�in onu kapatmam�z laz�m.
		scan.close();
		System.out.println("Hello,World.");
		System.out.println(inputString);

	}

}
