import java.util.Scanner;
public class ReverseTheInput {
    public static void main (String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int[] numArr = new int[5];

        int res =0,rem;
        while(num>0){
            rem = num%10;
            res = res*10+rem;
            num = num/10;
        }

        System.out.println("Revsrsed number : "+res);

        System.out.println("Enter Array of number");

        for(int i=0;i<numArr.length;i++){
            numArr[i] = sc.nextInt();
        }
        sc.nextLine();
        int[] numArr1 = new int[numArr.length];
        for(int i=numArr.length-1,j=0;i>=0;i--,j++){
            numArr1[j] = numArr[i];
        }

        System.out.println("Reversed Array :");
        for(int i=0;i<numArr1.length;i++){
            System.out.println(numArr1[i]+" ");
        }

        System.out.println("Enter String");
        String str = sc.nextLine();
        str.toLowerCase();
        String str1 = "";
        for(int i=str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
        }

        System.out.println("Revsered string : "+str1);
        sc.close();
    }
}
