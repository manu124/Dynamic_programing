import java.util.Scanner;

public class Path_with_maximum_gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n & m for array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        //array is created and filled
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //creat a storage
        //row will move & coloum will remain fix so j loop will get first
        int[][] dp = new int[n][m];
        for (int  j= m-1; j >=0 ; j--) {
            for (int i = n-1; i >=0; i--) {
                // divide in 4 parts 1 fst row, 2 last coloumn,lst row,else part
                if(j==m-1)
                    dp[i][j] = arr[i][j];
                else if(i==0){
                    int min_d=dp[i+1][j+1];
                    int min_m = dp[i][j+1];
                    dp[i][j] = arr[i][j]+Math.max(min_d,min_m);
                }
                else if(i==n-1){
                    int min_u=dp[i-1][j+1];
                    int min_m = dp[i][j+1];
                    dp[i][j] = arr[i][j]+Math.max(min_u,min_m);
                }
                else{
                    int min_d=dp[i+1][j+1];
                    int min_u=dp[i-1][j+1];
                    int min_m = dp[i][j+1];
                    dp[i][j] = arr[i][j]+Math.max(Math.max(min_u,min_m),min_d);
                }
            }
        }
        int max =dp[0][0];
        for (int i = 0; i < dp.length; i++) {
            if(dp[i][0]>max)
                max = dp[i][0];
        }
        System.out.println(max);
    }
}
