
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        
        System.out.print("Enter the number of stars per row: ");
        int nos = sc.nextInt();

        
        for(int i = 0; i < row; i++) {
            
            for(int j = 0; j < nos; j++) {
                System.out.print("*   ");
            }
            
            System.out.println();
        }

        
        sc.close();
    }
}
