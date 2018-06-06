package skelet.javaexperts.chapter2.exercise5;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class SearchBeer {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM Beers WHERE Alcohol=?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123")) {


        }
    }

    private static void printBeer(ResultSet resultSet) throws SQLException{
        String beerName = resultSet.getString("Name");
        double alcohol = resultSet.getDouble("Alcohol");
        double price = resultSet.getDouble("Price");
        System.out.println(beerName + " \t " + alcohol + " \t " + price);
    }
}
