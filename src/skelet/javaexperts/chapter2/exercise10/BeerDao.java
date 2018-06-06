package skelet.javaexperts.chapter2.exercise10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JonathanSyntra on 23/05/2017.
 */
public class BeerDao {
    private String url;
    private String user;
    private String password;

    public Beer getBeerById(int id) throws BeerException {
        String sql = "SELECT * FROM Beers WHERE Id=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con
                     .prepareStatement(sql)) {
            Beer beer = new Beer();

            return beer;
        } catch (SQLException e) {
            throw new BeerException(e);
        }
    }

    public List<Beer> getBeersByAlcohol(float alcohol) throws BeerException {
        String sql = "SELECT * FROM Beers WHERE Alcohol=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con
                     .prepareStatement(sql);) {
            List<Beer> beers = new ArrayList<Beer>();

            return beers;
        } catch (SQLException e) {
            throw new BeerException(e);
        }
    }

    public List<Beer> getBeersByName(String name) throws BeerException {
        String sql = "SELECT * FROM Beers WHERE Name LIKE ?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con
                     .prepareStatement(sql);) {
            List<Beer> beers = new ArrayList<Beer>();

            return beers;
        } catch (SQLException e) {
            throw new BeerException(e);
        }
    }

    public void updateBeer(Beer beer) throws BeerException {
        String sql = "UPDATE Beers SET Name=?, Price=?, Alcohol=?, Stock=?  WHERE Id=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con
                     .prepareStatement(sql)) {

        } catch (SQLException e) {
            throw new BeerException(e);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Private helper methods
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
