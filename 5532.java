import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, a, b, c, d, cnt = 0;
        l = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        while (true){
            a-=c;
            b-=d;
            cnt++;
            if(a<=0&&b<=0) break;
        }
        System.out.println(l-cnt);
        sc.close();
    }
}