import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int X=0;
        while(t>0)
        {
            String op=sc.next();
            if(op.contains("++"))
                X++;
            else
                X--;
            t--;
        }
        sc.close();
        System.out.println(X);
    }
}
