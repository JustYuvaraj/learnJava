import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    if (a>b && a> c){
        System.out.println(a+ " is largest");
    }
    else if (b>a && b>c){
        System.out.println(b+"is largest");
    } else{
        System.out.println(c+"is largest");
    }


        sc.close(); // Close the Scanner when finished
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    int ans = Math.max(a,b);
    int answer = Math.max(ans,c);
    System.out.printf(answer+ " is largest");

        sc.close(); // Close the Scanner when finished
    }
}