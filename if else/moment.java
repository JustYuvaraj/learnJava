
import java.util.Scanner; 
public class moment {
        public static void main(String[] args) {
            int x = 0,y=0;
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter a char:");
            char move = sc.next().charAt(0);
            switch(move){
                case 'l':
                    x--;
                    break;
                case 'r':
                    x++;
                    break;  
                case 'u':
                    y++;
                    break;
                case 'd':
                    y--;
                    break; 
                default:
                    System.out.println("invalid input");
            }
    
            sc.close(); // Close the Scanner when finished
        }
}
