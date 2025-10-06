import java.util.Scanner;
public class ArrayReverse {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int temp;
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
