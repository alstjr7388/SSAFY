package com.ssafy.algo;

import java.util.Scanner;

public class Main545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt3=0;
		int cnt5=0;
		for(int i=0; i<10;i++) {
			int num = sc.nextInt();
			if(num%3==0)
				cnt3++;
			if(num%5==0)
				cnt5++;
		}
		System.out.println("Multiples of 3 : "+cnt3);
		System.out.println("Multiples of 5 : "+cnt5);
		
	}

}
