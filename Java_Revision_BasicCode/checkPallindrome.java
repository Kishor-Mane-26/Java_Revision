import java.util.InputMismatchException;
import java.util.Scanner;

class checkPallindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice;
        do{
            System.out.println();
            System.out.println("1. Check if number is pallindrome");
            System.out.println("2. Check if array of number is palindrone");
            System.out.println("3. Check if array of characters is palindrone");
            System.out.println("4. Check if String is palindrome");
            System.out.println("0. Exit...");
            System.out.println("Enter your choice");
            
            while (true) {
                try {
                    choice = sc.nextInt();
                    break; 
                } 
                catch (InputMismatchException e) {
                    System.out.println("Invalid input! Try again.");
                    sc.nextLine();
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the number");
                    int num = sc.nextInt();;

                    int res=0,rem,temp = num;

                    while(temp>0){
                        rem = temp%10;
                        res = res*10+rem;
                        temp = temp/10;
                    }
                    if(res == num){
                        System.out.println("Number is \"Pallindrome\"");
                    }else{
                        System.out.println("Number is\"Not Pallindrome\"");
                    }

                    break;

                case 2:
                    System.out.println("Enter five numbers");
                    int numArr[] = new int[5];

                    for(int i=0;i<numArr.length;i++){
                        numArr[i] = sc.nextInt();
                    }

                    for(int i=0,j=numArr.length-1;i<=numArr.length/2;i++,j--){
                        if((!(numArr[i] == numArr[j])&& i == numArr.length/2)||(numArr[i] != numArr[j])){
                            System.out.println("Number array is \"Not Pallindrome\"");
                            break;
                        }else if((numArr[i] == numArr[j])&& i == numArr.length/2){
                            System.out.println("number is \"Pallindrome\"");
                        }
                    }

                    break;

                case 3:
                    System.out.println("Enter five characters");
                    int charArr[] = new int[5];

                    for(int i=0;i<charArr.length;i++){
                        charArr[i] = sc.next().charAt(0);
                    }
    
                    for(int i=0,j=charArr.length-1;i<=charArr.length/2;i++,j--){
                        if((!(charArr[i] == charArr[j])&& i == charArr.length/2)||(charArr[i] != charArr[j])){
                            System.out.println("Character array is \"Not Pallindrome\"");
                            break;
                        }else if((charArr[i] == charArr[j])&& i == charArr.length/2){
                            System.out.println("Character array is \"Pallindrome\"");
                        }
                    }

                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Enter the String");
                    String str = sc.nextLine();
                    for(int i=0,j=str.length()-1;i<=str.length()/2;i++,j--){
                        if((!(str.charAt(i) == str.charAt(j))&& i == str.length()/2) || str.charAt(i) != str.charAt(j)){
                            System.out.println("String is \"Not Pallindrome\"");
                            break;
                        }else if((str.charAt(i) == str.charAt(j))&& i == str.length()/2){
                            System.out.println("String is \"Pallindrome\"");
                        }
                    }
                    
                    break;

                case 0:
                    System.out.println("Switch-case exited...");
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while(choice != 0);

        sc.close();
    }
}