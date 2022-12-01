package lesson4_collections.hw;

import lesson2.enums.Gender;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.sort(Comparator.comparingInt(User::getAge));
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());

        ArrayList<String> strings = new ArrayList<>();
        strings.sort(String::compareTo);

        HashSet<User> userHashSet = new HashSet<>();
        Iterator<User> iterator = userHashSet.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getGender().equals(Gender.MALE)) {
                iterator.remove();
            }
        }




    }
}
