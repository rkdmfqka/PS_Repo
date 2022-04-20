import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        char c = sc.nextLine().charAt(0);
        BigInteger b = new BigInteger(sc.nextLine());
        if (c == '+') System.out.println(a.add(b));
        else System.out.println(a.multiply(b));
        sc.close();
    }
}