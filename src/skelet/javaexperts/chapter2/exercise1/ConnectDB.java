package skelet.javaexperts.chapter2.exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by JonathanSyntra on 9/05/2017.
 */
public class ConnectDB {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB","student","student123")) {
            System.out.println("Connection OK!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
