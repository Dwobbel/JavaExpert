package skelet.javaexperts.chapter2.exercise8;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class DBMetaData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");) {
            System.out.println("Database name: ");
            System.out.println("Database version: ");
            System.out.println("Driver name: ");
            System.out.println("Driver major version: ");
            System.out.println("Driver minor version: ");
            System.out.println("Transacties: ");
            System.out.println("Scrollable resultset: ");
            System.out.println("Updateable resultset: ");
        } catch (SQLException ex) {
            printError(ex);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    private static void printError(SQLException ex) {
        System.out.println("SQL state: " );
        System.out.println("SQL errorcode: " );
        System.out.println("SQL message:" );
        if (ex.getNextException() != null) {

        }
    }
}
