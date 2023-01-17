package day08_DictionariesAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> myHashMap = new HashMap<String, Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String name = scan.next();
			int phoneNumber = scan.nextInt();
			myHashMap.put(name, phoneNumber);


		}
		while (scan.hasNext()) {
			String _name =  scan.next();
			if (!myHashMap.containsKey(_name)) {
				System.out.println("Not found");
			} else {
				System.out.println(_name + "=" + myHashMap.get(_name));
			}
			
		}

		scan.close();
	}
}