import java.util.Scanner; 

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
             System.out.println(number + " is even");
        } else {
             System.out.println(number + " is odd");
        }

        sc.close(); // Close the Scanner when finished
    }
}

