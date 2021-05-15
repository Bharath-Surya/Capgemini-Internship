package patterns;
import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		int i, j, z = 1;
		System.out.println("Enter number of rows required:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			for(j = 0; j < i; j++) {
				System.out.print((z++) + " ");
			}
			System.out.println();
		}
	}


	}


