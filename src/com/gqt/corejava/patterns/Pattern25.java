package com.gqt.corejava.patterns;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows: ");
        int n =5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}
