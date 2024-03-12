import java.util.Scanner; 

public class sumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number < 0) {
             System.out.println("invalid number");
             return;
        } 
        System.out.println(number*(number+1)/2);

        sc.close(); // Close the Scanner when finished
    }
}