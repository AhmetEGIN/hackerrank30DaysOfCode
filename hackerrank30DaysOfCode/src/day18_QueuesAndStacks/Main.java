package day18_QueuesAndStacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	Queue<Character> myQueue;
	Stack<Character> myStack;

	public Main() {
		myQueue = new LinkedList<Character>();
		myStack = new Stack<Character>();
	}

	public void pushCharacter(char ch) {
		myStack.add(ch);

	}

	public void enqueueCharacter(char ch) {
		myQueue.add(ch);
	}

	public char popCharacter() {
		return this.myStack.pop();
	}

	public char dequeueCharacter() {
		return this.myQueue.remove();
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().toLowerCase();
		scan.close();
		
		char[] chars = s.toCharArray();

		for (char c : chars) {
			main.pushCharacter(c);
			main.enqueueCharacter(c);
		}

		boolean state = true;
		for (int i = 0; i < chars.length; i++) {
			if (main.dequeueCharacter() != main.popCharacter()) {
				state = false;
				break;
			} else {
				continue;
			}

		}
		

		System.out.println("The word, "+ s +", is"+(state ? "" : " not") +  " a palindrome" );
		

	}

}
