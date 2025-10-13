
import java.util.Scanner;

public class george_accomodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prblm=0;
        while(n>0)
        {
            int[] c=new int[2];
            c[0]=sc.nextInt();
            c[1]=sc.nextInt();
            if(c[1]-c[0]>=2)
                prblm++;
            n--;
        }
        System.out.println(prblm);
        sc.close();
    }
}
