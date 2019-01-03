package com.ssafy.algo;

import java.util.Scanner;

public class Main533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sex = sc.next();
		int old = sc.nextInt();
		
		if(sex.equals("F"))
			if(old>=18)
				System.out.println("WOMAN");
			else
				System.out.println("GIRL");
		if(sex.equals("M"))
			if(old>=18)
				System.out.println("MAN");
			else
				System.out.println("BOY");
	}

}
