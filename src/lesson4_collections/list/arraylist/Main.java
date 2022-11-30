package lesson4_collections.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("ajhsfdhafsd1");
//        strings.add("ajhsfdhafsd2");
//        strings.add("ajhsfdhafsd3");
//        strings.add("ajhsfdhafsd4");
//        strings.add("ajhsfdhafsd5");
//        strings.add(1, "foo");
////        strings.remove("foo");
////        strings.remove(3);
//        strings.sort((s1, s2) -> s1.compareTo(s2));
//        strings.forEach(s -> System.out.println(s));
//        System.out.println(strings.contains("foo"));
//        strings.size();
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        strings.addAll(arrayList);
//        strings.removeAll(arrayList);
        List<User> users = new ArrayList<>();

        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
//        users.forEach(System.out::println);

//        for (User user : users) {
//            if (user.getId() == 2) {
//                users.remove(user);
//            }
//        }

//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getId() == 2) {
//                iterator.remove();
//            }
//        }
//        System.out.println(users);


        users.removeIf(user -> user.getName().length() > 5);
        System.out.println(users);

        System.out.println(users.get(0));//kokos


    }

}
