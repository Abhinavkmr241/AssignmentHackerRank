//You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.
//
//If B<=0  or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

package com.capgemini.assignment1;

import java.util.Scanner;

public class StaticInitializerBlock {
	static {
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int height = s.nextInt();
		s.close();
		if ((base <= 0) || (height <= 0)) {
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			int result = base*height;
			System.out.println("Area of Parallelogram is: " + result);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
