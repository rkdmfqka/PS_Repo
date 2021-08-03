package first_semester;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result[] = new int[5];
		int l = sc.nextInt();
		int p = sc.nextInt();
		int cnt = l * p;
		for (int i = 0; i < 5; i++) {
			int tmp = sc.nextInt();
			result[i] = tmp - cnt;
		}
		for (int i : result)
			System.out.println(i);
		sc.close();
	}
}
