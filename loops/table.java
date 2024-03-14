import java.util.Scanner;
public class table
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table no:");

		int n = sc.nextInt();
		System.out.print("Entertill table no:");

		int m = sc.nextInt();
                int i =1;
		while(i<=m){
		    System.out.println(i+"X"+n+"="+n*i);
		    i = i +1;
		}
	}
}
