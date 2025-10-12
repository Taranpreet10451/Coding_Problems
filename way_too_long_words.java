import java.util.Scanner;
 
public class way_too_long_words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String str = sc.next();
            if (str.length() <= 10)
                System.out.println(str);
            else {
                String abr = str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1);
                System.out.println(abr);
            }
            n--;
        }
        sc.close();
    }
}