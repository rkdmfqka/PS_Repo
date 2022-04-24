import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if (s.equals("0")) break;
            while (true){
                int sum = 0;
                if (s.length()<2) break;
                else {
                    for (int i=0; i<s.length(); i++) sum += s.charAt(i) - '0';
                }
                s = String.valueOf(sum);
            }
            System.out.println(s);
        }
    }
}
