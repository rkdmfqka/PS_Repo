import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t>0){
            BigInteger sum = new BigInteger("0");
            String s = br.readLine();
            BigInteger n = new BigInteger(br.readLine());
            for (int i=0; i<n.intValue(); i++){
                BigInteger candy = new BigInteger(br.readLine());
                sum = sum.add(candy);
            }
            if ((sum.remainder(n)).compareTo(BigInteger.ZERO)==0) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}