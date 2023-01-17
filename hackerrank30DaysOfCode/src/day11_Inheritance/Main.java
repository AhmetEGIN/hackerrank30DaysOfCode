package day11_Inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String _firstName = scan.next();
		String lastName = scan.next();
		int _idNumber = scan.nextInt();
		int lenghtOfScores = scan.nextInt();
		int[] _scores = new int[lenghtOfScores];
		for (int i = 0; i < lenghtOfScores; i++) {
			_scores[i] = scan.nextInt();
		}
		
		Student s = new Student(_idNumber, _firstName, lastName, _scores);
		s.getPersonDetails();
		s.getGrades();
		scan.close();

	}

}

class Person{
	private int idNumber;
	private String firstName;
	private String lastName;
	public Person(int idNumber, String firstName, String lastName) {
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void getPersonDetails() {
		System.out.println("Name: " + lastName +  ", " + firstName);
		System.out.println("ID: " + idNumber);
	}
	
}

class Student extends Person{
	private int[] scores;
	public Student(int idNumber, String firstName, String lastName, int[] scores) {
		super(idNumber, firstName, lastName);
		this.scores = scores;
	}
	
	public char calculate() {
		int result = Arrays.stream(scores).reduce(0, (p,c) -> p+c) / scores.length;

		if (result>=90 && result<=100) return 'O';
		else if(result<90 && result>=80) return 'E';
		else if(result<80 && result>=70) return 'A';
		else if(result<70 && result>=55) return 'P';
		else if(result<55 && result>=40) return 'D';
		else return 'T';
		
	}
	public void getGrades() {
		System.out.println("Grade: " + calculate());
	}
	
}
