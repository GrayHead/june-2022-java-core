package lesson4_collections.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");

        PreparedStatement preparedStatement = connection.prepareStatement("select * from city");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<City> cityList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String cityName = resultSet.getString(2);
            int zip = resultSet.getInt(3);
            cityList.add(new City(id, cityName, zip));

        }

//        cityList.forEach(city -> System.out.println(city));

        cityList.stream()
                .filter(city -> city.getId() >= 400 && city.getId() <= 500)
                .sorted(Comparator.comparingInt(City::getZip))
                .toList()
                .forEach(System.out::println);


        connection.close();
    }
}
