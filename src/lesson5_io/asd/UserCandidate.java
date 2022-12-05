package lesson5_io.asd;

import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class UserCandidate extends Person implements Comparable<UserCandidate>, Comparator<UserCandidate> {


    public UserCandidate(int id,
                         String name,
                         String surname,
                         String email,
                         int age,
                         Gender gender,
                         ArrayList<Skills> skills,
                         Car car) {
        super(id, name, surname, email, age, gender, skills, car);
    }

    @Override
    public int compare(UserCandidate o1, UserCandidate o2) {
        return o1.getSkills().size() - o2.getSkills().size();
    }

    @Override
    public int compareTo(UserCandidate o) {
        return (o.getName() + o.getSurname())
                .compareTo(this.getName() + this.getSurname());
    }

    @Override
    public String toString() {
        return "UserCandidate:\n" + super.toString() + "\n ===========";
    }
}
