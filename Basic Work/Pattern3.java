package patterns;
import java.util.Scanner;

public class Pattern3 {

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
				if(i == n) {
					for(j = 0; j < z; j++) {
						System.out.print("*");
					}
				}
				else {
					if(j == 0 || j == (z - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			z += 2;
			System.out.println();
		}
	}

}

		

