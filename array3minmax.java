import java.util.*;
public class array3minmax {
    public static void main(String[] args) {
        int arr [] = {3,5,4,7,6,9,8,7};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];              
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }           
        }
        System.out.println("min element is : " + min);
        System.out.println("max element is : " + max);

    }

}
