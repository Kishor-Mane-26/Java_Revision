import java.util.Scanner;
public class ArrayOccurance {
    public static void main (String x[]){
        int [] a = new int[5];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter elements in array");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int count;
        int[] freq = new int[a.length];
        int visited = -1;
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i]!=visited){
                freq[i] = count;
            }
            
        }
        System.out.println();
        System.out.println("Frequecy of element in array");
        for(int i=0;i<a.length;i++){
            if(freq[i]!=visited){
                System.out.println("Element : "+a[i]+" Frequency : "+freq[i]);
            }
        }
    }
}