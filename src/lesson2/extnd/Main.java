package lesson2.extnd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.greeting(); //


        ArrayList<User> users = new ArrayList<>();
        users.add(new User()); // 0
        users.add(new Customer(111, "asasd", "qweqwe", "mn,n,m")); //1

        User user1 = users.get(0);
        User user2 = users.get(1);
        Customer cust = (Customer) user2;

        System.out.println(cust);


        User user = new Customer(123, "asdasd", "eqweqw", "lesson5_io.asd@lesson5_io.asd.com");

        Admin admin = new Admin();


        users.add(admin);


    }
}


