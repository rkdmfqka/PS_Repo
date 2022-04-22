import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_cnt = 0;
        int b_cnt = 0;
        int t = sc.nextInt();
        for (int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>b) a_cnt++;
            else if (b>a) b_cnt++;
        }
        System.out.println(a_cnt + " " + b_cnt);
        sc.close();
    }
}