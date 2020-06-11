package com.capgemini.assignment2;

import java.util.Scanner;

public class StringAssignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :-");
		String inputstr = sc.nextLine();
		sc.close();
		String str[] = inputstr.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i % 2 != 0) {
				String[] str2 = str[i].split("");
				for (int j = str2.length - 1; j >= 0; j--) {
					System.out.print(str2[j]);
				}
				System.out.print(" ");
			} else {
				System.out.print(str[i]);
				System.out.print(" ");
			}
		}
	}
}
