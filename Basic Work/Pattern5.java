package patterns;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		int i, j, z = 1;
		System.out.println("Enter number of rows required:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			for(j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for(j = 0; j < z; j++) {
				if(j == 0 || j == (z - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			z += 2;
			System.out.println();
		}
		z = (2 * (n - 1)) - 1;
		for(i = 1; i <= (n - 1); i++) {
			for(j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(j = 0; j < z; j++) {
				if(j == 0 || j == (z - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			z -= 2;
			System.out.println();
		}
		

	}

}
