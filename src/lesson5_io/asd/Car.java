package lesson5_io.asd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    CarModel carModel;
    String year;

    @Override
    public String toString() {
        return "[carModel=" + carModel +
                ", year='" + year + '\'' +
                ", power=" + power + "]";
    }

    int power;
}
