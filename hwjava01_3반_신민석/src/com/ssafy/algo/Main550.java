package com.ssafy.algo;

import java.util.Scanner;

public class Main550 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
