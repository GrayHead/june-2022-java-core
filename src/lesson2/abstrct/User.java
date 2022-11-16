package lesson2.abstrct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    private int id;
    private String name;

    public abstract String asdqwe(String s);
}
