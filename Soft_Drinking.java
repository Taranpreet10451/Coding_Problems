import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        sc.close();
        int total_litre=(k*l)/nl;
        int total_lime_slice=c*d;
        int total_salt=p/np;
        int result=(int)Math.min(Math.min(total_litre,total_lime_slice),total_salt)/n;
        System.out.println(result);
    }
}
