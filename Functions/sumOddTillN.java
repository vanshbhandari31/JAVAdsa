import java.util.*;
public class sumOddTillN {
    public static int sumFuncOdd(int n){
        int sum=0;
        for (int i = 1; i <= n ; i=i+2) {
            sum=sum+i;          
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=sumFuncOdd(n);
        System.out.println(result);

        
    }
    
}