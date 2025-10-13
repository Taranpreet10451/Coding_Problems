import java.util.Scanner;

public class word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.next();
        int u=0;
        int l=0;
        for(char c:w.toCharArray())
        {
            if(Character.isUpperCase(c))
                u++;
            else if(Character.isLowerCase(c))
                l++;
        }
        if(u>l)
            System.out.println(w.toUpperCase());
        else    
            System.out.println(w.toLowerCase());
        sc.close();
    }
}
