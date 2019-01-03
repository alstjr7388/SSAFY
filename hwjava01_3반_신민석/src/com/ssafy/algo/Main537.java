package com.ssafy.algo;

import java.util.Scanner;

public class Main537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int cnt = 1;
		while(cnt <= num)
			sum += cnt++;
		System.out.println(sum);
	}

}
