
import java.util.Scanner;

public class Queue_at_theSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        sc.close();
        while(t>0)
        {
            sb=new StringBuilder();
            for(int i=0;i<n;i++)
            {
                if(i+1<n && s.charAt(i)=='B' && s.charAt(i+1)=='G')
                {
                    char p='B';
                    char next='G';
                    sb.append(next);
                    sb.append(p);
                    i=i+1;
                }
                else
                    sb.append(s.charAt(i));
            }
            s=sb.toString();
            t--;
        }
        System.out.println(sb.toString());
    }    
}
