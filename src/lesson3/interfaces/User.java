package lesson3.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Singer, Runner {
    private int id;
    private String name;

    @Override
    public void sing() {
        System.out.println("SING SONG about" + this.name);
    }

    @Override
    public int run(int avgSpeed) {
        return 1000 / avgSpeed;
    }

    @Override
    public void stop() {

    }
}
