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

    }
}
