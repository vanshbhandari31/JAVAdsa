import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=90;
        marks[1]=80;
        marks[2]=96;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks are " + marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE NEW ARRAY    ");
        int size = sc.nextInt();
        int array2[]= new int[size];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
            
        }
    }
    
}
