import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        while (n>=2 && m>=1 && n+m>=k+3){
            n-=2;
            m-=1;
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}