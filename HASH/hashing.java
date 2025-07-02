package hash;
import java.util.HashSet;
import java.util.Iterator;


public class hashing {

    public static void main(String[] args) {
        //Creating a hashset
        HashSet<Integer> set= new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //however only unique elements will be added
        System.out.println(set);

        //Search in Hashset
        if (set.contains(1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if (!set.contains(6)){
            System.out.println("doesnt contains");
        }

        //Delete
        set.remove(2);
        System.out.println(set);
        if (!set.contains(2)){
            System.out.println("doesnt contain");
        }

        //Size of set
        System.out.println(set.size());
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //iterator of set
        //set doesnt have index
        //therefore this iterator
        Iterator it=set.iterator();

        //hasNext , next
        //next might return the elements in UNORDERED MANNER
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());


        //resetting the iterator
        it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }








    }

}
