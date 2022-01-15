import java.util.Scanner;

public class Coin_change_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter coin");
        int number_coin=sc.nextInt();

        int[] arr = new int[number_coin];
        for(int i = 0;i<number_coin;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter target");
        int tar = sc.nextInt();
        int[] dp = new int[tar+1];
        dp[0]=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] +=dp[j-arr[i]];
            }
        }
        System.out.println(dp[tar]);
    }
}
