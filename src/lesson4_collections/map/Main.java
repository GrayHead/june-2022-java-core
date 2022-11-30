package lesson4_collections.map;

import lesson4_collections.list.arraylist.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*LHM*/
//        LinkedHashMap<String, User> map = new LinkedHashMap();
//        map.put("petya", new User(1, "Petrov"));
//        map.put("borya", new User(2, "Borysov"));
//        map.put("Sheva", new User(3, "Schevchenko"));
//        User petya = map.get("petya");
//
////        Map<String, String> form = new LinkedHashMap<>();
////        form.put("username", "vasya");
////        form.put("age", "31");
//
////        Set<String> strings = map.keySet();
////        System.out.println(strings);
////        Collection<User> values = map.values();
//
////        User petya1 = map.get("petya");
////        map.containsKey()
//
//        Set<Map.Entry<String, User>> entries = map.entrySet();
//        System.out.println(entries);
//        entries.removeIf(next -> next.getValue().equals(new User(1, "Petrov")));

        /*HM*/

//        HashMap<String, User> map = new HashMap();
//        map.put("petya", new User(1, "Petrov"));
//        map.put("borya", new User(2, "Borysov"));
//        map.put("Sheva", new User(3, "Schevchenko"));
////        map.put("Sheva", new User(4, "aogfyasfd"));
//        System.out.println(map);
////        map.getOrDefault("asdqwe", new User());


        TreeMap<String, User> map = new TreeMap();
        map.put("petya", new User(1, "Petrov"));
        map.put("borya", new User(2, "Borysov"));
        map.put("sheva", new User(3, "Schevchenko"));
        System.out.println(map);


    }
}
