package lesson2.hw.task1;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "asd",
                "asdqwe",
                "asd@asd.com",
                new Address(
                        "asdasd",
                        "asdasd",
                        "asdasd",
                        "asdasd",
                        new Geo("123", "-123")
                ),
                "4356789",
                "owu.com.ua",
                new Company(
                        "ajsfdhasdf",
                        "ajsfdhasdf",
                        "ajsfdhasdf"
                )
        );


    }
}
