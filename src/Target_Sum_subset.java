import java.util.Scanner;

public class Target_Sum_subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int tar = sc.nextInt();
        boolean[][] dp = new boolean[size + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {//we check immidate above
                    if (dp[i - 1][j]) {
                        dp[i][j] = true;
                    } else {
                        int val = arr[i - 1];
                        if (j >= val) {
                            if (dp[i - 1][j - val])
                                dp[i][j] = true;
                        }
                    }
                }
            }

        }
        System.out.println(dp[arr.length][tar]);
    }
}
