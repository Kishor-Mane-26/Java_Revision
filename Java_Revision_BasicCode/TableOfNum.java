import java.util.Scanner;
public class TableOfNum {
    public static void main(String x[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Table of "+num+":");

        for(int i=1;i<=10;i++){
            System.out.println(i*num);
        }

        sc.close();
    }
}
