import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cute_cnt = 0;
        int not_cnt = 0;
        for(int i=0; i<n; i++){
            if(sc.nextInt()==0) not_cnt++;
            else cute_cnt++;
        }
        if(cute_cnt>not_cnt) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
        sc.close();
    }
}