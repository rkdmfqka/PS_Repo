import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int sum = 0;
        for (int i=0; i<9; i++) sum+=sc.nextInt();
        System.out.println(price-sum);
        sc.close();
    }
}