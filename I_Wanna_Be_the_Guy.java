import java.util.HashSet;
import java.util.Scanner;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int[] X=new int[p];
        for(int i=0;i<p;i++)
        {
            X[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[] Y=new int[q];
        for(int i=0;i<q;i++)
        {
            Y[i]=sc.nextInt();
        }
        sc.close();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<p;i++)
        {
            set.add(X[i]);
        }
        for(int i=0;i<q;i++)
        {
            set.add(Y[i]);
        }
        HashSet<Integer> SET=new HashSet<>();
        for(int i=1;i<=n;i++)
        {
            SET.add(i);
        }
        boolean end=false;
        for(int i:SET)
        {
            if(!set.contains(i))
            {
                end=true;
                break;
            }
        }
        if(end)
            System.out.println("Oh, my keyboard!");
        else
            System.out.println("I become the guy.");
    }
}
