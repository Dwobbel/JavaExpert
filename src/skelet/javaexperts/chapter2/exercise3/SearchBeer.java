package skelet.javaexperts.chapter2.exercise3;

import java.sql.*;

/**
 * Created by JonathanSyntra on 9/05/2017.
 */
public class SearchBeer {
    public static void main(String[] args) {
        String sql = "SELECT b.Name, b.Alcohol, b.Price, c.Category, br.Name "
                + "FROM Beers as b, Brewers as br, Categories as c "
                + "WHERE b.BrewerId=br.Id AND b.CategoryId=c.Id ORDER BY b.Alcohol";
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student",
                "student123")) {
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()) {
                    String beerName = rs.getString("b.Name");
                    String beerAlc = rs.getString("b.Alcohol");
                    String beerPrice = rs.getString("b.Price");
                    String Cat = rs.getString("c.Category");
                    String BrewName = rs.getString("br.Name");
                    System.out.println(beerName + " heeft een alcoholgehalte van " + beerAlc + "% en kost: " + beerPrice + " euro. Dit is een bier van categorie" + Cat + "en komt van brouwerij " +BrewName);
                }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
