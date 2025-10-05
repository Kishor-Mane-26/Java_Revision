public class ConmandlineArgument {
    public static void main(String x[]){
        int num1 = Integer.parseInt(x[0]);
        int num2 = Integer.parseInt(x[1]);
        System.out.println("num1: "+num1+" num2: "+num2+" before swapping");
        
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1: "+num1+" num2: "+num2+" after swapping");

        char ch1 = x[2].charAt(0);
        char ch2 = x[3].charAt(0);

        System.out.println(ch1+ "\t"+ch2);


        String str = x[4];
        String str1 = x[5];

        System.out.println(str);
        System.out.println(str1);
    }
}
