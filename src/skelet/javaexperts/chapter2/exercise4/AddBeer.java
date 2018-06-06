package skelet.javaexperts.chapter2.exercise4;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class AddBeer {
    public static void main(String[] args) throws Exception {
        try (   Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");
                Statement stmt = con.createStatement()) {
            int brewerNr = findBrewer(stmt, "Alken");

            int catNr = findCategory(stmt, "Tripel");

            String sql = "INSERT INTO Beers (Name, Alcohol, Price, Stock, BrewerId, CategoryId) "
                            + "VALUES('Jackson Tripel',12,4.5,100,"
                            + brewerNr
                            + ","
                            + catNr
                            + ")";
    }
}

    private static int findBrewer(Statement stmt, String brewer)
            throws SQLException {
        int brewerNr = -1;
        String sql = "SELECT Id FROM Brewers WHERE Name='" + brewer + "'";

        return brewerNr;
    }

    private static int findCategory(Statement stmt, String category)
            throws SQLException {
        String sql = "SELECT Id FROM Categories WHERE Category='" + category + "'";
        int catNr = -1;

        return catNr;
    }
}
