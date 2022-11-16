package lesson2.finalll;

public class Main {
    public static void main(String[] args) {


//        User.id = 1;
        User user = new User(); // 1

        User user1 = new User();
//        User.id = 2;
        System.out.println(user1.id); // 2

        System.out.println(user.id); //2
//        User.id = 200;


    }
}
