import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double arr[] = new double[t];
        for(int i=0; i<t; i++){
            arr[i] = sc.nextDouble();
            double discount = arr[i]*80/100;
            System.out.println("$" + String.format("%.2f", discount));
        }
        sc.close();
    }
}