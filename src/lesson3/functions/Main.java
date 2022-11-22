package lesson3.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


//        Function<Integer, String> function = new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return Integer.toString(integer);
//            }
//        };

        List<User> users = Arrays.asList(
                new User("asd", "qwe"),
                new User("asd1", "qwe1"),
                new User("asd2", "qwe2"),
                new User("asd3", "qwe3")
        );

//        List<Customer> customers = new ArrayList<>();
//        for (User user : users) {
//            customers.add(new Customer((int) Math.random(), user.getName() + user.getSurname()));
//        }
//
//        System.out.println(customers);


//        converter(users, user -> new Customer((int) Math.random(), user.getName() + " " + user.getSurname()));


        Function<User, Customer> userCustomerFunction = user -> new Customer((int) (Math.random() * 1000), user.getName() + user.getSurname());
        List<Customer> customers = new ArrayList<>();
        for (User user : users) {
            customers.add(userCustomerFunction.apply(user));
        }

        System.out.println(customers);

        BiFunction<String, Integer, Integer> stringIntegerIntegerBiFunction = new BiFunction<>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return null;
            }
        };


    }

//    public static List<Customer> converter(
//            List<User> userList,
//            Function<User, Customer> userCustomerFunction) {
//
//        List<Customer> customers = new ArrayList<>();
//        for (User user : userList) {
//            Customer c = userCustomerFunction.apply(user);
//            customers.add(c);
//        }
//
//        return customers;
//
//    }
}
