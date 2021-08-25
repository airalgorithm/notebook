package class02;

import java.util.HashMap;

public class Code09_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Hello1");
        map.put(2, "Hello2");
        map.put(3, "Hello3");
        map.put(4, "Hello4");
        map.put(5, "Hello5");
        map.put(6, "Hello6");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(8));

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(10));

        map.remove(6);
    }
}
