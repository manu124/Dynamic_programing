import java.util.Scanner;

public class Minimum_cost_path {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter matrix size");
       int n = sc.nextInt();
       int[][] arr = new int[n][n];
       //fill the initial array with the data.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int mat = n-1;
        //Now we make a copy of the array or dp array
        int[][] dp = new int[n][n];
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = arr[0].length-1; j >=0 ; j--) {
                if(i==mat && j == mat )
                    dp[i][j] = arr[i][j];
                else if(i==mat )
                    dp[i][j]=arr[i][j]+dp[i][j+1];
                else if(j==mat)
                    dp[i][j] = arr[i][j]+dp[i+1][j];
                else{
                    int min1 =  dp[i][j+1];
                    int min2 =  dp[i+1][j];
                    int min = Math.min(min1,min2);
                    dp[i][j] = arr[i][j]+ min;
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
