package lesson2.hw.task2;

//PC-Laptop-Ultrabook
//PC-Laptop- Workstation


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private Monitor monitor;
    private Cpu cpu;
    private Ram ram;

}
