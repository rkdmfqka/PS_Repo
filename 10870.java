import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonazzi(n));
        sc.close();
    }
    static int fibonazzi(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonazzi(n-1) + fibonazzi(n-2);
    }
}