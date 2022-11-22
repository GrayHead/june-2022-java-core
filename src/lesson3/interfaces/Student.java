package lesson3.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Singer {
    private String name;

    @Override
    public void stop() {

    }

    @Override
    public int run(int avgSpeed) {
        return 0;
    }

    private String email;

    @Override
    public void sing() {
        System.out.println("ahgfdafsdytfqyfytfq");
    }
}
