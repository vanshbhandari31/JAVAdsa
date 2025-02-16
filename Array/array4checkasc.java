import java.util.*;
public class array4checkasc {
    public static boolean isasc(int[] arr){
        boolean check=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                check= false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i < size ; i++){
        System.out.print("Enter the " + i + " element: ");
        arr[i]=sc.nextInt();
        sc.nextLine();
    }
    boolean check=isasc(arr);
    if(check){
        System.out.println("The given array is in ascending order");
    }
    else{
        System.out.println("The given array is not in ascending order");
    } 
}
}
