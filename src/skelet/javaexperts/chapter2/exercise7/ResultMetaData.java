package skelet.javaexperts.chapter2.exercise7;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class ResultMetaData {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT Id,Name,Price,Stock,Alcohol FROM Beers WHERE Alcohol = 9";
        //String sql = "SELECT * FROM Beers WHERE Alcohol = 9";
        //String sql = "update Beers set Stock=100 WHERE Alcohol = 9";
        int longvarbinary = Types.LONGVARBINARY; //Ignore this type

        System.out.println(sql);
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");
             Statement stmt = con.createStatement();) {
            boolean result = stmt.execute(sql);
            if (result) {
                processResultSet(stmt);
            } else {
                processUpdateCount(stmt);
            }
        }
    }

    private static void processUpdateCount(Statement stmt) throws SQLException {
        //Print the amount of records changed
    }

    private static void processResultSet(Statement stmt) throws SQLException {
        //Print the result with column names on the first line and values on the
        //following lines (Optional: set the correct width of the value)
        try (ResultSet rs = stmt.getResultSet()) {

            System.out.println();
            while (rs.next()) {

            }
        }
    }
}
