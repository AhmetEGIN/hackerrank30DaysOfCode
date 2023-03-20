package day13_AbstractClasses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String _title = scan.nextLine();
		String _author = scan.nextLine();
		int _price = scan.nextInt();
		
		scan.close();
		
		MyBook myBook = new MyBook(_title, _author, _price);
		myBook.display();

	}

}



abstract class Book{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}	
	abstract void display();
}



class MyBook extends Book{

	public MyBook(String title, String author, int price) {
		super(title, author, price);

	}

	@Override
	void display() {
		System.out.println("Title : " + title +"\nAuthor: " + author + "\nPrice: " + price);
		
	}
	
}

