package hash;
import java.util.*;

public class hashing2 {
        //hashMaps are unordered
    public static void main(String[] args) {
        //country and population map
        HashMap<String,Integer> map=new HashMap<>();
        //INSERTION
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);
        //auto update value for already existing key value , else new pair is added
        map.put("China",180);
        System.out.println(map);

        //Search or LookUP operation

        if(map.containsKey("China")){
            System.out.println("yes");
        }
        if(map.containsValue(150)){
            System.out.println("yes yes yes ");
        }
        //to get value from map. if value exists , it is returned , else null
        System.out.println(map.get("China"));
        System.out.println(map.get("Indo"));

        //KEY: if it exists , TRUE else FALSE
        //GET: if exists  , returns the value , else NULL

        int arr[]={1,2,3,4,5};
        for(int val:arr){
            System.out.println(val);
        }

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //to get a set of keys
        Set<String> keys=map.keySet();
        System.out.println(keys);
        for(String key:keys){
            System.out.println(key + " "+ map.get(key));
        }


        //REMOVE KEY PAIR
        map.remove("China");
        System.out.println(map);

    }
}
