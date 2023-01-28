package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer>hs = new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        System.out.println("hs.size() = " + hs.size());

        hs.remove(5); // bu kalkar ama yeni sirlaama karisik olur cunku hs oldugu icin
        System.out.println("remove sonrasi hs = " + hs);

        if (hs.contains(7))
            System.out.println("var");  // bool olan bir degiskendir , if e ozel degil
        else
            System.out.println("yok");

        hs.clear();
        System.out.println("hs = " + hs); // bos olur [] cikar









    }
}
