package com.ssafy.algo;

import java.util.Scanner;

public class Main553 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char a = 'A';
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++)
				System.out.print((char)(a + cnt++));
			System.out.println();
		}
	}

}
