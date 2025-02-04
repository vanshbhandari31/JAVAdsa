package PATTERNS;

import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i=0;i<=rows;i++){
            for(int j=0;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}
