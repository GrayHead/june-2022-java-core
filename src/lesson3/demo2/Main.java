package lesson3.demo2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(11, 22, 33, 44);

//        showListInfo(integers, new AscendingArrayPrinter());
//        showListInfo(integers, new DescendingArrayPrinter());
        showListInfo(integers,new Helper());


    }


    public static void showListInfo(List<Integer> numbers, ArrayPrinter arrayPrinter) {
        arrayPrinter.print(numbers);

    }
}
