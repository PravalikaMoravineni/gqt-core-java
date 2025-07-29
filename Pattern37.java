/**
 * 
 */
package Patterns;

import java.util.Scanner;

/**
 * 
 */
/**
 * @author chinni1
 * @category Pattern37
 * @description this is an example for conditional statements
 */
public class Pattern37 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n=sc.nextInt();
		for (int i=0;i<=n-1;i++) {
			for (int j=0;j<=n-1;j++) {
				if (i == 0 || i == (n-1) || j == 0 || j == (n-1)) {
				System.out.print("# ");
			}
			else {
				System.out.print("- ");
			}
			}
				System.out.println();
			}	
			}
		}