import java.util.*;
public class functionfactorial {
    public static int calcfactorial(int num){
        int fact=1;
        for (int i = 1; i <= num ; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int fact=calcfactorial(num);
        System.out.println("The fatorial of the given number is : " + fact);
    }
}
 