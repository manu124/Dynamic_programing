import java.util.Scanner;

public class Climbing_stares_Minimum_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of stare scase");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //enter number that can jump on particular position
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Integer[] dp = new Integer[n+1];
        for (int i = n; i >= 0; i--) {
            if(arr[i] >0){
                Integer min = Integer.MAX_VALUE;
                for (int j = 1; j <=arr[i] && i+j<dp.length; j++) {
                    if(dp[i+j] !=null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if(min !=Integer.MAX_VALUE)
                    dp[i] =min + 1;
            }

        }
        System.out.println(dp[0]);
    }
}
