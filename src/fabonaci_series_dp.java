import java.util.Scanner;

public class fabonaci_series_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for fabocani");
        int number = sc.nextInt();
        int arr[] = new int[number+1];
        System.out.println(fabo(number,arr));
    }
    static int fabo(int n, int[] arr){
        if(n == 0 & n==1 )
            return n;
        if(arr[n]!=0)
            return arr[n];
        int a = fabo(n-1,arr);
        int b = fabo(n-2,arr);
        int sum = a+b;

        arr[n] = sum;
        return sum;
    }
}
