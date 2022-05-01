import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = 2;
        for (int i=0; i<n; i++) point += (point-1);
        System.out.println(point*point);
        sc.close();
    }
}