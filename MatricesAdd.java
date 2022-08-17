import java.lang.*;
import java.util.*;

class MatricesAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for first matrices : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the number of roms and columns of second matrices : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        if (r == p && c == q) {
            int[][] m1 = new int[r][c];
            int[][] m2 = new int[p][q];
            int[][] result = new int[p][q];

            System.out.println("Enter the elements of first matrix : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("Enter the elements of second matrix : ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            System.out.println("");

            System.out.println("First Matrix : ");
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("Second Matrix : ");
            for(int i = 0; i < p; i++){
                for(int j = 0; j <q; j++){
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println("");
            }
            for(int i = 0; i < r; i++){
                for(int j = 0; j < q; j++){
                    for(int k = 0; k < c; k++){
                        result[i][j] = m1[i][j] + m2[i][j];
                    }
                }
            }
            System.out.println(" Resultant Matrices : ");
            for(int i = 0; i < r; i++){
                for(int j = 0; j < q; j++ ){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}