package lesson5_io.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        User user = new User(-100, "asjdhasdg");

        handler(user);

    }

    @SneakyThrows
    public static void handler(User user) {
        Class<? extends User> uzer = user.getClass();
        Field[] fields = uzer.getDeclaredFields();
        for (Field field : fields) { // id name
            if (field.isAnnotationPresent(CustomIDValidator.class)) {
                field.setAccessible(true);

                int id = (int) field.get(user);
                if (id < 1) {
                    CustomIDValidator annotation = field.getAnnotation(CustomIDValidator.class);
                    String msg = annotation.msg();

                    throw new Exception(msg);
                }


            }

        }


    }
}
