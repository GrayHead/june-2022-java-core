package lesson2.compose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private CommonData commonData;

    public User(int id, String name, String surname) {
        this.id = id;
        this.commonData = new CommonData(name, surname);

    }
}
