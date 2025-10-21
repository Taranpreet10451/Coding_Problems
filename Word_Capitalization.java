
import java.util.Scanner;

public class Word_Capitalization
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        if(Character.isLowerCase(s.charAt(0)))
        {
            char ch=s.charAt(0);
            ch=Character.toUpperCase(ch);
            String str=ch+s.substring(1);
            System.out.println(str);
        }
        else
            System.out.println(s);
    }
}
