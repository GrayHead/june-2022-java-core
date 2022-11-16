package lesson2.delegation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    private int power;
    private double volume;


    public void start() {
        System.out.println("bubububububububutrtrtrtrbubububububu");

    }

}
