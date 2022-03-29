import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[10];
        int result = a*b*c;
        while (result>0){
            arr[result%10]++;
            result/=10;
        }
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
        sc.close();
    }
}