package com.ssafy.algo;

import java.util.Scanner;

public class Main539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		float avg=0;
		int cnt=0;
		do {
			num = sc.nextInt();
			sum+=num;
			cnt++;
		}while(num<100);
		avg = (float)sum/cnt;
		System.out.println(sum);
		System.out.printf("%.1f",avg);
	}

}
