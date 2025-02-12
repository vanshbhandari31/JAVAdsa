import java.util.*;
public class Array2findNo {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search :  ");
        int x=sc.nextInt();    
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==x) {
                System.out.println("The postion of the element is : " + (i+1));
                
            }
            
        }
    }    
}
