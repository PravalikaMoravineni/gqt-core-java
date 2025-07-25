package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int n = sc.nextInt();
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
			System.out.println();
		}

	}

}
