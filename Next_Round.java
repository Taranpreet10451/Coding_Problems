import java.util.Scanner;
public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cutoff = arr[k - 1]; 
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= cutoff && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
