import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, result;
        for (int i=0; i<t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            result = 1;
            for (int j=0; j<b; j++) result = a * result % 10;
            if (result==0) result = 10;
            System.out.println(result);
        }
        sc.close();
    }
}