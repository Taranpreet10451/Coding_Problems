import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int swap=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max=Integer.MIN_VALUE,maxpos=-1;
        int min=Integer.MAX_VALUE,minpos=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxpos=i;
            }
            if(arr[i]<=min)
            {
                min=arr[i];
                minpos=i;
            }
        }
        swap=maxpos+(n-1-minpos);
        if(maxpos>minpos)
            swap--;
        System.out.println(swap);
    }
}
