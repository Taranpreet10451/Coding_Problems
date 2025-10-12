import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String t=sc.next().toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>t.charAt(i))
            {
                System.out.println("1");
                break;
            }
            else if(s.charAt(i)<t.charAt(i))
            {
                System.out.println("-1");
                break;
            }
            else
                c++;
        }
        if(c==s.length())
            System.out.println("0");
        sc.close();
    }
}
