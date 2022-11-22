package lesson3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        users.add(new User(6, "mango"));

//        users.forEach(user -> System.out.println(user));

        users
                .stream()
                .sorted((user1, user2) -> user1.getId() - user2.getId())
                .filter(user -> user.getName().length() > 5)
                .map(user -> user.getId() + ":" + user.getName())
                .forEach(user -> System.out.println(user));


    }
}
