package lesson2.hw.task2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cpu {
    private String model;
    private Producer producer;
    private int clock;


}
