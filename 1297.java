package first_semester;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		double result = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		System.out.println((int) Math.sqrt(result * Math.pow(H, 2)) + " " + (int) Math.sqrt(result * Math.pow(W, 2)));
		sc.close();
	}
}