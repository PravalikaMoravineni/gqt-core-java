package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count:");
		int n = sc.nextInt();
		int value;
		for (int i=1; i<=n; i++) {
			value=i;
			for (int j=1; j<=n; j++);
			System.out.print(value + " ");
			value = value + n;
		}
		System.out.println();	
	}
}

