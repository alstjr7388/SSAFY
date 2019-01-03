package com.ssafy.algo;

import java.util.Scanner;

public class Main549 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		for(int i=1; sum<num;i+=2) {
			sum += i;
			cnt++;
		}
		System.out.print(cnt+" "+sum);
	}
		

}
