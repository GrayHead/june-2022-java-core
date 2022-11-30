package lesson4_collections.stream;

import lesson4_collections.list.arraylist.User;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//        List<User> users = new ArrayList<>();
//        users.add(new User(2, "kokos"));
//        users.add(new User(1, "ananas"));
//        users.add(new User(3, "banan"));
//        users.add(new User(5, "tomat"));
//        users.add(new User(4, "potatos"));
//        users.add(new User(6, "mango"));
//        users.add(new User(2, "kokos"));
//        users.add(new User(1, "ananas"));
//        users.add(new User(3, "banan"));
//        users.add(new User(5, "tomat"));
//        users.add(new User(4, "potatos"));
//        users.add(new User(6, "mango"));
//        System.out.println(users);
//        Optional<String> max = users.stream()
//                .distinct()
//                .filter(user -> user.getId() > 2)
//                .sorted((u1, u2) -> u1.getId() - u2.getId())
//                .map(user -> user.toString())
//                .max((s1, s2) -> s1.compareTo(s2));




        TreeMap<String, User> map = new TreeMap();
        map.put("petya", new User(1, "Petrov"));
        map.put("borya", new User(2, "Borysov"));
        map.put("sheva", new User(3, "Schevchenko"));
        System.out.println(map);


        Set<Map.Entry<String, User>> entries = map.entrySet();
        Map<String, User> collect = entries.stream()
                .filter(stringUserEntry -> stringUserEntry.getValue().getId() > 1)
                .collect(Collectors.toMap(
                        stringUserEntry -> stringUserEntry.getKey(),
                        stringUserEntry -> stringUserEntry.getValue()
                ));

        System.out.println(collect);


    }
}
