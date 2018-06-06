package skelet.javaexperts.chapter2.exercise6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class ChangeStock {
    private static final String SQL1 = "UPDATE Beers SET Stock=100 WHERE Name ='Jupiler'";
    private static final String SQL2 = "UPDATE Beers SET Stock=100 WHERE Name ='Piraat'";

    public static void main(String[] args) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB",
                "student",
                "student123")) {
            try (Statement stmt = con.createStatement()) {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
