package com.capgemini.assignment2;

import java.util.Scanner;

public class StringAssignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :-");
		String inputstr = sc.nextLine();
		sc.close();
		String str[] = inputstr.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			System.out.print(str[i].length());
			System.out.print(" ");
		}
	}
}
