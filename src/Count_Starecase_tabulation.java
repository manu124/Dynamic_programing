import java.util.Scanner;

public class Count_Starecase_tabulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num+1];
        System.out.println("with memory =="+count_memory(num,arr));
        System.out.println(count_tabular(num,arr));

    }
    static int count_memory(int n , int[] arr){
        if(n == 0)
            return 1;
        else if(n < 0)
            return 0;
        if(arr[n]>0)
            return arr[n];
        int a = count_memory(n-1,arr);
        int b = count_memory(n-2,arr);
        int c = count_memory(n-3,arr);
        int sum = a + b + c;
        arr[n] = sum;
        return sum;
    }
    static int count_tabular(int n,int[] arr){

        arr[0] =1;
        for (int i = 1; i < n; i++) {
            if (n == 1)
               arr[i] = arr[n - 1];
            else if (n == 2)
                arr[i] = arr[n - 1] + arr[n - 2];
            else
                arr[i] = arr[n-1]+arr[n-2]+arr[n-3] ;

        }
        return arr[n];
    }
}
