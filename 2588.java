import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 100 || n > 999 || m < 100 || m > 999) return;
        System.out.println(n * (m % 10));
        System.out.println(n * ((m / 10) % 10));
        System.out.println(n * (m / 100));
        System.out.println(n * m);
        sc.close();
    }
}