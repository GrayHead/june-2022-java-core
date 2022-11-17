package lesson2.hw.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monitor {
    private String model;
    private String producer;
    private int inch;
}
