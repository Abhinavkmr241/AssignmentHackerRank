package com.capgemini.assignment2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string :- ");
		String input = sc.nextLine();
		sc.close();
		char[] temp = input.toCharArray();
		for (int i = temp.length - 1; i >= 0; i--) {
			System.out.print(temp[i]);
		}
	}
}
