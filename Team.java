
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prblm=0;
        int j=1;
        while(j<=n)
        {
            int c=0;
            for(int i=1;i<=3;i++)
            {
                int x=sc.nextInt();
                if(x==1)
                    c++;
            }
            if(c>=2)
                prblm++;
            j++;
        }
        System.out.println(prblm);
        sc.close();
    }
}
