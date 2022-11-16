package lesson2.delegation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    private String model;
    private Engine engine;

    public void start() {
        this.getEngine().start();
    }
}

