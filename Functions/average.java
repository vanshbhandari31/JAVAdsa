import java.util.*;
public class average {
    public static float averagecalc(float num1, float num2, float num3){
        float result = (num1+num2+num3)/3;
        return result;

    }   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();
        sc.nextLine();
        float result = averagecalc(num1, num2, num3);
        System.out.println(result);

    }
}
