package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int i, j, z = 1;
		System.out.println("Enter number of rows required:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i <= n; i++) { //outer loop
			for(j = 0; j < (n - i); j++) { //space loop
				System.out.print(" ");
			}
			for(j = 0; j < z; j++) { //print loop
				System.out.print("*");
			}
			z += 2;
			System.out.println();
		}
	}
}
		
		
