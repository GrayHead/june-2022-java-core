package lesson4_collections.hw;

import lesson1.classes.Car;
import lesson2.enums.Gender;
import lesson2.hw.task3.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<>();
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.skills.size()-  o.skills.size();
    }
}
