
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double total=0.0;
        for(int i=1;i<=n;i++)
        {
            double x=sc.nextDouble();
            total+=x;
        }
        sc.close();
        double result=total/n;
        System.out.println(result);
    }
}
