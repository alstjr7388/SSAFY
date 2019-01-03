package com.ssafy.algo;

import java.util.Scanner;

public class Main538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("number?");
			int num = sc.nextInt();
			if(num>0)
				System.out.println("positive integer");
			else if(num<0)
				System.out.println("negative integer");
			else
				break;
		}
	}

}
