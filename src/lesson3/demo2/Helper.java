package lesson3.demo2;

import java.util.List;

public class Helper extends Xxx implements ArrayPrinter {
    public void print(List<Integer> integerList) {
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

    }
}
