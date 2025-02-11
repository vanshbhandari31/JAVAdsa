import java.util.*;
public class greater {
    public static void greaternum(float num1, float num2){
        if(num1==num2){
            System.out.println("Both are equal");
        }
        else if(num1>num2){
            System.out.println("First Number is bigger");
        }
        else{
            System.out.println("Second number is bigger");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        Float num1=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the Second number : ");
        float num2=sc.nextFloat();
        greaternum(num1, num2);
        
    }
    
}
