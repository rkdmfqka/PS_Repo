import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int cnt = 0;
            String str = sc.next();
            if (str.equals("0")) break;
            for (int i=0; i<str.length(); i++){
                String s = str.substring(i, i+1);
                if (s.equals("0")) cnt+=5;
                else if (s.equals("1")) cnt+=3;
                else cnt+=4;
            }
            System.out.println(cnt+1);
        }
        sc.close();
    }
}