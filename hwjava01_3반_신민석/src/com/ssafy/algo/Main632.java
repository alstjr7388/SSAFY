package com.ssafy.algo;

import java.util.Scanner;

public class Main632 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = num1;
		
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		
		System.out.println(min);

	}

}
