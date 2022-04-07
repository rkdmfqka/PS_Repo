import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        if (n==1) System.out.println(1);
        else {
            for (int i=1; i<n; i++){
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println(fn);
        }
        sc.close();
    }
}