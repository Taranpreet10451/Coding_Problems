import java.util.Scanner;

public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long[] arr=new long[(int)m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextLong();
        }
        long time=0;
        long curr=1;
        for(int i=0;i<m;i++)
        {
            if(arr[i]>=curr)
                time+=arr[i]-curr;
            else
                time+=(n-curr)+arr[i];
            curr=arr[i];
        }
        System.out.println(time);
    }
}
