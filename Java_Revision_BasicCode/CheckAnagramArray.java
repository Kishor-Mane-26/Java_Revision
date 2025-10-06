import java.util.Scanner;
public class CheckAnagramArray{
    public static void main (String x[]){
        Scanner sc= new Scanner (System.in);
        char a[] = new char[5];
        char b[] = new char[5];

        System.out.println("Enter first Array");

        for(int i=0;i<a.length;i++){
            a[i] = sc.next().charAt(0);
        }

        System.out.println("Enter second Array");

        for(int i=0;i<b.length;i++){
            b[i] = sc.next().charAt(0);
        }
        
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=92){
                a[i] =(char)((int)a[i]+32);
            }
        }

        for(int i=0;i<b.length;i++){
            if(b[i]>=65 && b[i]<=92){
                b[i] = (char)((int)a[i]+32);
            }
        }
        int count;
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println("Arrays are not Anagram");
            }else if(count!=0 && i==a.length-1){
                System.out.println("Arrays are Anagram");
            }
        }
    }
}