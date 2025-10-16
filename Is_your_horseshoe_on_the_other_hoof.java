
import java.util.HashSet;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int n=sc.nextInt();
            if(set.contains(n))
                count++;
            else
                set.add(n);   
        }
        System.out.println(count);
        sc.close();
    }
}
