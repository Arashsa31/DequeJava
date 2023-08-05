package LabProgram1113;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int j;
		String line;

		/* Type your code here. */
		line = scnr.nextLine();

		Deque<Character> d = new LinkedList<Character>();
		// have loop to compare first and last character of string
		// if there is a mismatch, thisis not a palindrome
		// if there is no mismatch for the entire string, this is a palindrome
		for (int i = 0; i < line.length(); i++) {
			if (Character.isLetter(line.charAt(i))) {
				d.push(line.charAt(i));
			}
		}
		boolean flag = true;
		while (d.size()>1) {
			if(!(d.removeFirst().equals(d.removeLast()))) {
				System.out.println("No, \""+ line + "\" is not a palindrome.");
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("Yes, \""+ line + "\" is a palindrome.");
		}
	}
}
