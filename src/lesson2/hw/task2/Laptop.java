package lesson2.hw.task2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends PC {
    private Touchpad touchpad;

    public Laptop(Monitor monitor, Cpu cpu, Ram ram, Touchpad touchpad) {
        super(monitor, cpu, ram);
        this.touchpad = touchpad;
    }


}
