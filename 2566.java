import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int max_i = 0, max_j = 0;
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
                if (arr[max_i][max_j] < arr[i][j]) {
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(arr[max_i][max_j]);
        System.out.println((max_i+1) + " " + (max_j+1));
        sc.close();
    }
}