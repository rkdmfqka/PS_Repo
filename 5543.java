import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger=new int[3];
        int[] cider=new int[2];
        for(int i=0; i<3; i++) burger[i]=sc.nextInt();
        for(int i=0; i<2; i++) cider[i]=sc.nextInt();
        int ch_burger=burger[0], ch_cider=cider[0];
        for(int i=0; i<3; i++){
            if(burger[i]<ch_burger) ch_burger=burger[i];
        }
        for(int i=0; i<2; i++){
            if(cider[i]<ch_cider) ch_cider=cider[i];
        }
        System.out.println(ch_burger+ch_cider-50);
        sc.close();
    }
}