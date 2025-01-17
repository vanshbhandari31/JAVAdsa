import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        //add elements operations
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(1);
        System.out.print("THE LIST                  : ");
        System.out.println(list);

        //add elemenets and a given postion
        list.add(1,9);
        System.out.print("ADD AN ELEMENT            : ");
        System.out.println(list);

        //get elements
        int ele=list.get(3);
        System.out.print("GET AN ELEMENT            : ");
        System.out.println(ele);

        //change
        list.set(3,10);
        System.out.print("CHANGE ELEMENT AT INDEX   : ");
        System.out.println(list);
        //delete

        list.remove(0);
        System.out.print("REMOVE ELEMENT FROM LIST  : ");
        System.out.println(list);
        //size

        int size=list.size();
        System.out.print("SIZE OF THE LIST          : ");
        System.out.println(size);
        //sort
        
        Collections.sort(list);
        System.out.print("SORT THE LIST             : ");
        System.out.println(list);
    }
}
