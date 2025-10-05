public class ConmandlineArgument {
    public static void main(String x[]){
        int num1 = Integer.parseInt(x[0]);
        int num2 = Integer.parseInt(x[1]);
        System.out.println("num1: "+num1+" num2: "+num2+" before swapping");
        
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1: "+num1+" num2: "+num2+" after swapping");
    }
}
