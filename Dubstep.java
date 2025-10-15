
import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        sc.close();
        StringBuilder song=new StringBuilder();
        int i=0;
        boolean space=false;
        while(i<st.length())
        {
            if(i+3<=st.length() && st.substring(i,i+3).equals("WUB"))
            {
                i=i+3;
                if(space)
                {
                    song.append(" ");
                    space=false;
                }
            }
            else
            {
                song.append(st.charAt(i));
                i++;
                space=true;
            }
        }
        System.out.println(song);
    }
}
