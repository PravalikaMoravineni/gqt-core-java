package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
					if(i==0 || i==(n-1) || j==0 || j==(n-1))
					{
						System.out.print("0 ");
					}
					else {
						System.out.print("  ");
					}
				}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==(n-1) || i+j==(n/2))
				{
					System.out.print("1 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 || i+j==(n-1) || i==(n-1))
				{
					System.out.print("2 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || i+j==(n-1) && i<(n/2) || i==j && j>=(n/2))
				{
					System.out.print("3 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i+j==(n/2) ||i==(n/2))
				{
					System.out.print("4 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)|| i==(n/2) || j==0 && i<(n/2) || j==(n-1) && i>(n/2))
				{
					System.out.print("5 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n-1) || i==(n/2) || j==(n-1) && i>=(n/2))
				{
					System.out.print("6 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 && j<(n/2) || j==(n/2) || i==(n/2))
				{
					System.out.print("7 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n-1) || j==(n-1) || i==(n/2))
				{
					System.out.print("8 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 && i<n/2 || i==(n-1) || j==(n-1) || i==(n/2))
				{
					System.out.print("9 ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.println();
		}
	}
}
