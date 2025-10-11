import java.util.Scanner;
public class Beautiful_matrices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[5][5];
        int posi = 0;
        int posj = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] != 0) {
                    posi = i;
                    posj = j;
                }
            }
        }
        int r = Math.abs(posi - 2);
        int c = Math.abs(posj - 2);
        System.out.println(r + c);
        sc.close();
    }
}