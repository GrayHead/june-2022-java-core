package lesson5_io.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

//        Properties properties = System.getProperties();
//        Set<Object> objects = properties.keySet();
//        for (Object o : objects) {
//            System.out.println(o + " -> "+System.getProperty((String) o));
//        }

//        String property = System.getProperty("user.home");
//        File sszhu = new File(property);
//        System.out.println(sszhu);
//        File[] files = sszhu.listFiles();
//        for (File file : files) {
//            System.out.println((file.isDirectory() ? "dir" : "file") + " " + file.getName());
//        }


        File oktenTxt = new File(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
//        if (!oktenTxt.exists()) {
//            oktenTxt.createNewFile();
//        }
//        FileOutputStream fileOutputStream = new FileOutputStream(oktenTxt, true);
//        fileOutputStream.write("okten java core".getBytes(StandardCharsets.UTF_8));
//        fileOutputStream.close();


        FileInputStream inputStream = new FileInputStream(oktenTxt);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String x = new String(bytes);
        System.out.println(x);

        inputStream.close();

    }

}

