package day04_ClassVsInstance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int age = scan.nextInt();
			Person person = new Person(age);
			person.amIOld();
			for (int j = 0; j < 3; j++) {
				person.yearPasses();
			}
			person.amIOld();
		}
		scan.close();

	}

}

class Person{
	int age;
	public Person(int initialAge) {
		if (initialAge >= 0) {
			this.age = initialAge;
		}
		else {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	
	public void yearPasses() {
		age++;
	}
	public void amIOld() {
		if (age < 13) System.out.println("You are young.");
		else if(age >= 13 && age < 18) System.out.println("You are teenager.");
		else System.out.println("You are old.");
	}
}
