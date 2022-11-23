package lesson3.hw.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Magazine("Maxim", 54, Type.BLUSH));
        printableList.add(new Book("451", 400, Genre.HORROR));

        for (Printable printable : printableList) {
            printable.print();
        }

    }
}
