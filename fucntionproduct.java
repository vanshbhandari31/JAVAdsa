import java.util.Scanner;
public class fucntionproduct {
    public static int addTwoNumbers(int num1 , int num2){
        int prod = num1 * num2;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int prod = addTwoNumbers(num1, num2);
        System.out.println("Product of two numbers is " + prod);
    }
}
