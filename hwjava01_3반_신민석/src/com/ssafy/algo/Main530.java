package com.ssafy.algo;

import java.util.Scanner;

public class Main530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int old = sc.nextInt();
		
		if(old>=20)
			System.out.println("adult");
		else
			System.out.println((20-old)+" years later");
	}

}
