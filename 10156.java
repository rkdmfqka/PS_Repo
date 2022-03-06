import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int money = k*n-m;
        if(k*n>m) System.out.println(money);
        else System.out.println("0");
        sc.close();
    }
}