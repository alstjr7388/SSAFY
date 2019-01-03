package com.ssafy.algo;

import java.util.Scanner;

public class Main546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum=0;
		float avg = 0;
		
		for(int i=0; i<num;i++) {
			sum += sc.nextInt();
		}
		avg = (float)sum/num;
		System.out.printf("avg : %.1f\n",avg);
		if(avg>=80)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
