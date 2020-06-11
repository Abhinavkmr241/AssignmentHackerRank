package com.capgemini.assignment2;

import java.util.Scanner;

public class StringAssignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :-");
		String inputstr = sc.nextLine();
		sc.close();
		String str[] = inputstr.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 0) {
				if (i - 2 < 0) {
					System.out.print(str[str.length - 1]);
					System.out.print(" ");
				} else {
					System.out.print(str[i - 2]);
					System.out.print(" ");
				}
			} else {
				System.out.print(str[i]);
				System.out.print(" ");
			}
		}
	}
}
