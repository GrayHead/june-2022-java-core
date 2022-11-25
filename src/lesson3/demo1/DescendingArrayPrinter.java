package lesson3.demo1;

import java.util.List;

public class DescendingArrayPrinter extends ArrayPrinter {

    @Override
    public void print(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
             System.out.println(numbers.get(i));

        }
    }
}
