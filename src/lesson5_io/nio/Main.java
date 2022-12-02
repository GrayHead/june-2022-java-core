package lesson5_io.nio;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        Path sszhu = Paths.get(System.getProperty("user.home"));
//        Stream<Path> list = Files.list(sszhu);
//        list.forEach(path -> System.out.println(path));
        Path oktnTxt = Paths.get(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");

        String msg = "asiyqydqywe";
        byte[] bytes = msg.getBytes();
        Files.write(oktnTxt, bytes, StandardOpenOption.APPEND);

        List<String> stringList = Files.readAllLines(oktnTxt);
        System.out.println(stringList + "!!!!");



    }
}
