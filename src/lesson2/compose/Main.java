package lesson2.compose;

public class Main {
    public static void main(String[] args) {

//        CommonData commonNameSurname = new CommonData("vasya", "pupkin");
//
//        User user = new User(1, commonNameSurname);
//        Customer customer = new Customer(commonNameSurname, 32, "asdasda@asd.com");



        User user = new User(1, "vasya","pupkin");
        CommonData commonData = user.getCommonData();


    }
}
