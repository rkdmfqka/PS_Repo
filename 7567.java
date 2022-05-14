import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dish = sc.next();
        int result = height(dish);
        System.out.println(result);
        sc.close();
    }
    public static int height(String n) {
        int result = 10;
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i - 1) == n.charAt(i)) result += 5;
            else result += 10;
        }
        return result;
    }
}