import java.util.Scanner;

public class Path_with_maximum_gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n & m for array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        //array is created and filled
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
