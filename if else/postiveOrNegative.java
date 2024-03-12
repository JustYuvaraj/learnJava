import java.util.Scanner;
public class postiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number > 0) {
             System.out.print("positive");
            if(number%2==0){
                System.out.println(" Even");
            } else{
               System.out.println(" odd");
            }
        } 
        else if (number<0){
            System.out.print("negative");
            if(number%2==0){
                System.out.println(" Even");
            } else{
                System.out.println(" odd");
            }
        }
        else{
            System.out.println("zero");
        }

        sc.close(); // Close the Scanner when finished
    }
}

