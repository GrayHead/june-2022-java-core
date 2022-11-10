package lesson1.chain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class User {
    private int id;
    private String name;
    private boolean status;

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setStatus(boolean status) {
        this.status = status;
        return this;
    }
}
