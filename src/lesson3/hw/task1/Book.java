package lesson3.hw.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable {
    private String title;
    private int pages;
    private Genre genre;

    @Override
    public void print() {
        System.out.println(this);
    }
}
