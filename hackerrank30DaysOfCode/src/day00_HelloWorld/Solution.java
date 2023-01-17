package day00_HelloWorld;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Scanner class'ýnýn bir instance'ýný oluþturduk.
		// Scanner input almak için kullanýlýr.
		String inputString = scan.nextLine();  // input ta bulunan veriyi inputString adýndaki variable' a kaydeder.
		//Scan class ýndan oluþturduðumuz instance ile iþimiz bitti. 
		// Bellekte gereksiz yer kaplamamasý için onu kapatmamýz lazým.
		scan.close();
		System.out.println("Hello,World.");
		System.out.println(inputString);

	}

}
