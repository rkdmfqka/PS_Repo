import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 0;
        int m = 0;
        int time;
        for (int i=0; i<n; i++){
            time = sc.nextInt();
            y += ((time/30)+1)*10;
            m += ((time/60)+1)*15;
        }
        if (y<m) System.out.println("Y " + y);
        else if (y>m) System.out.println("M " + m);
        else System.out.println("Y M " + y);
        sc.close();
    }
}
