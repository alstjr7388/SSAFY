package com.ssafy.algo;

import java.util.Scanner;

public class Main534 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String ch = sc.next();
		
		if(ch.equals("A"))
			System.out.println("Excellent");
		else if(ch.equals("B"))
			System.out.println("Good");
		else if(ch.equals("C"))
			System.out.println("Usually");
		else if(ch.equals("D"))
			System.out.println("Effort");
		else if(ch.equals("F"))
			System.out.println("Failure");
		else
			System.out.println("error");
	}

}
