
import java.util.Scanner;
public class stones_on_the_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int removals=0;
        char[] ch=s.toCharArray();
        for(int i=1;i<n;i++)
        {
            if(ch[i]==ch[i-1])
                removals++;
        }
        System.out.println(removals);
        sc.close();
    }
}
