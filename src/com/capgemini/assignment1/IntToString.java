//You are given an integer n, you have to convert it into a string.
//n should be in range -100 to 100.
//If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

package com.capgemini.assignment1;

import java.util.Scanner;

public class IntToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if ((n >= -100) && (n <= 100)) {
			String s = Integer.toString(n);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer");
			}
		} else {
			System.out.println("Wrong answer");
		}
	}
}
