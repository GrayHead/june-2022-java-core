package lesson4_collections.list.arraylist;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Comparable<User> {
    private int id;
    private String name;

    @Override
    public int compareTo(User user) {
        return this.id - user.getId();
    }
}
