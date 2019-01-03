package com.ssafy.algo;

import java.util.Scanner;

public class Main529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		int obesity = weight + 100 - height;
		System.out.println(obesity);
		if(obesity>0)
			System.out.println("Obesity");
	}

}
