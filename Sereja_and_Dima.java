import java.util.*;
public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int s=0,d=0;
        int turn=1;
        int l=0,r=n-1;
        while(l<=r)
        {
            if(arr[l]>arr[r])
            {   if(turn%2==0)
                {
                    d+=arr[l];
                }
                else
                    s+=arr[l];
                l++;
            }
            else
            {
                if(turn%2==0)
                {
                    d+=arr[r];
                }
                else
                    s+=arr[r];
                r--;
            }
            turn++;
        }
        System.out.println(s+" "+d);
    }
}
