import java.util.Scanner;
public class Climbing_with_Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int arr[] = new int[n]; //as we are going to 6-1
        int dp[] = new int[n+1];
        System.out.println("enter jump for code");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("output ="+count(n,dp,arr));

    }
    static int count(int n,int[] dp,int[] arr){
        dp[n]=1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <= arr[i] && (i+j<dp.length); j++) {
                dp[i] += dp[i+j];
            }
        }
        return dp[0];
    }
}
