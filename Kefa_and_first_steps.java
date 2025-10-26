import java.util.Scanner;

public class Kefa_and_first_steps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        if(n==0)
        {
            System.out.println("0");
            sc.close();
            return;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int maxlen=1;
        int curr=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=arr[i-1])
                curr++;
            else    
                curr=1;
            maxlen=Math.max(maxlen, curr);
        }
        System.out.println(maxlen);
    }
}
