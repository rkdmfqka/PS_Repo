import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int belly_cnt = 0;
            int back_cnt = 0;
            for(int j=0; j<4; j++){
                int n = sc.nextInt();
                if(n==1) back_cnt++;
                else belly_cnt++;
            }
            if(belly_cnt==1 && back_cnt==3) System.out.println("A");
            else if(belly_cnt==2 && back_cnt==2) System.out.println("B");
            else if(belly_cnt==3 && back_cnt==1) System.out.println("C");
            else if(belly_cnt==4) System.out.println("D");
            else System.out.println("E");
        }
        sc.close();
    }
}