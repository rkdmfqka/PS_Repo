package first_semester;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int hexadec = Integer.parseInt(num, 16);
		System.out.println(hexadec);
		sc.close();
	}
}
