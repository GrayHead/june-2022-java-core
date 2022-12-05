package lesson2.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        User user = new User(1, "lesson5_io.asd", Gender.FEMALE);
//        Gender gender = user.getGender();
//        if (gender.isPipka()) {
//            System.out.println("asdhfgadfgasdfd");
//        }
//
//        if (gender.equals(Gender.FEMALE)) {
//            System.out.println("ashdfgahdfhagsd");
//        }

        Gender[] values = Gender.values();
        System.out.println(Arrays.toString(values)); // male female


    }


}
