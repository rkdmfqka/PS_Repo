package first_semester;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int[] month_array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int day_sum = day;
		for (int i = 0; i < month - 1; ++i) day_sum += month_array[i];
		System.out.println(week[day_sum % 7]);
		sc.close();
	}
}
