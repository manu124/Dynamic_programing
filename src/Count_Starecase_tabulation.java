import java.util.Scanner;

public class Count_Starecase_tabulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num+1];

    }
    static int count_memory(int n , int[] arr){
        if(n == 0)
            return 0;
        else if(n < 0)
            return 0;
        if(arr[n]!=0)
            return arr[n];
        int a = count_memory(n-1,arr);
        int b = count_memory(n-2,arr);
        int c = count_memory(n-3,arr);
        int sum = a + b + c;
        arr[n] = sum;
        return sum;
    }
}
