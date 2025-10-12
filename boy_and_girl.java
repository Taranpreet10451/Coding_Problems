import java.util.HashSet;
import java.util.Scanner;
 
public class boy_and_girl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        int c = set.size();
        if (c % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
        sc.close();
    }
}