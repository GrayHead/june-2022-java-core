package lesson1.lists;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private int id;
    private String name;
    private ArrayList<String> skills = new ArrayList<>();

}
