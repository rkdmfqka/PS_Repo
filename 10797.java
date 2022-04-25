import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int arr[] = new int[5];
        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            if (n == arr[i]) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
