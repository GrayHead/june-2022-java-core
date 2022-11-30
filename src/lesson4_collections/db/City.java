package lesson4_collections.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {
    private int id;
    private String cityName;
    private int zip;
}
