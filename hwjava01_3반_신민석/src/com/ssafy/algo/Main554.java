package com.ssafy.algo;

import java.util.Scanner;

public class Main554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int start = 1;
		int ch = 'A';
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++)
				System.out.print(start++ + " ");
			for (int j = 0; j<= i; j++)
				System.out.print((char)(ch+cnt++)+" ");
		}

	}

}
