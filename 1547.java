import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int num = 1;
        for (int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (num==x) num = y;
            else if (num==y) num = x;
        }
        System.out.println(num);
        sc.close();
    }
}