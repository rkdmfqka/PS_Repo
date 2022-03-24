import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] korea = new int[9];
        int[] yonsei = new int[9];
        for(int i=0; i<t; i++) {
            int y = 0;
            int k = 0;
            for(int j=0; j<9; j++){
                yonsei[j] = sc.nextInt();
                y += yonsei[j];
                korea[j] = sc.nextInt();
                k += korea[j];
            }
            if(k > y) System.out.println("Korea");
            else if(y > k) System.out.println("Yonsei");
            else System.out.println("Draw");
        }
        sc.close();
    }
}