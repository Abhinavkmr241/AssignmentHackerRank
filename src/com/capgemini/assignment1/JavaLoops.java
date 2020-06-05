//Given an integer, N, print its first 10 multiples. Each multiple Nxi (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

package com.capgemini.assignment1;

import java.util.Scanner;

public class JavaLoops {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for (int i=1; i<=10; i++ ) {
            int result = N*i;
            System.out.println(N +" x "+ i+ " = "+ result);
        }
		s.close();
	}
}
