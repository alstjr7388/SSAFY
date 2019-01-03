package com.ssafy.algo;

import java.util.Scanner;

public class Main544 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum =0;
		for(;num<=100;num++)
			sum+=num;
		System.out.println(sum);
	}

}
