package lesson2.hw.task2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook extends Laptop {
    private double weight;

//    public Ultrabook(Touchpad touchpad, double weight) {
//        super(touchpad);
//        this.weight = weight;
//    }

    public Ultrabook(Monitor monitor, Cpu cpu, Ram ram, Touchpad touchpad, double weight) {
        super(monitor, cpu, ram, touchpad);
        this.weight = weight;
    }
}
