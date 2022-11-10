package lesson1.lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("asdasdqwe");
//        list.add("qwytfdayfsd");
//        System.out.println(list);


        ArrayList<String> skillsList = new ArrayList<>();
        skillsList.add("java");
        skillsList.add("js");
        skillsList.add("html");

        User user = new User(1, "kokos", skillsList);

        System.out.println(user);

        user.getSkills().add("mysql");
        System.out.println(user);



        User ashdfasfh = User.builder()
                .id(123)
                .name("ashdfasfh")
                .build();

    }
}
