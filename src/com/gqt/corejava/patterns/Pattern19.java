package com.gqt.corejava.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n = 5;
		        int num = 1;
		        for(int i = n; i >= 1; i--) {
		            for(int j = 1; j <= i; j++) {
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println();
		        }
	}
}
		  