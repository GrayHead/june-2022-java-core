package lesson5_io.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @CustomIDValidator(msg = " your user id is lower than 1")
    private int id;
    private String name;
}
