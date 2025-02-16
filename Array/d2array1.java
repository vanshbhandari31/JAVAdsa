import java.util.*;
public class d2array1 {
    public static void arrayinsert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols=sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the" + i + j + "element");
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        arrayinsert();

    }
    
}
