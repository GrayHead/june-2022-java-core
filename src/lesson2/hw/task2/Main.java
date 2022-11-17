package lesson2.hw.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PC pc = new PC(
                new Monitor("asd", "asdqwe", 17),
                new Cpu("i7", Producer.INTEL, 1234),
                new Ram(Type.DDR4, "asytqwef", 8)
        );

        Laptop laptop = new Laptop(
                new Monitor("asd", "asdqwe", 17),
                new Cpu("i7", Producer.INTEL, 1234),
                new Ram(Type.DDR4, "asytqwef", 8),
                new Touchpad("qweqwe", "sfyt7q575s7yrfsd7")
        );

        Ultrabook ultrabook = new Ultrabook(

                new Monitor("asd", "asdqwe", 17),
                new Cpu("i7", Producer.INTEL, 1234),
                new Ram(Type.DDR4, "asytqwef", 8),
                new Touchpad("qweqwe", "sfyt7q575s7yrfsd7"),
                1.3
        );

//        PC pcx = pc;
//        PC pcx = laptop;
//        PC pcx = ultrabook;

//        ArrayList<PC> list = new ArrayList<>() {{
//            this.add(laptop);
//            this.add(ultrabook);
//            this.add(pc);
//        }};


        // int ...x
        List<PC> list = Arrays.asList(pc, laptop, ultrabook);


    }
}
