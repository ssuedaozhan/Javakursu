package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
// set -> hashset, linkedhashset,treeset
        // map -> hashmap,linkedhashmap,treemap
        // map = anahtar + set -> anahtarli set
        // anahtarin to=ipi Integer, degerinin tipi string olsun

        HashMap<Integer,String>hm= new HashMap<>();
        hm.put(1001, "Sueda Yildirim");
        hm.put(1002,"Furkan Yildirim ");
        hm.put(1003, "Faruk Ozhan");
        hm.put(2001, "Furkanicokseviyorum");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));
        System.out.println("hm.containskey(12) = " + hm.containsKey(12));
        System.out.println("hm .keyset()= " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());


        hm.remove(5001);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }

    }
