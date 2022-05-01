package bridge;

import java.sql.*;

public class BridgePatternInJava {

    public static void main(String[] args) throws ClassNotFoundException {
        // JDBC
        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem::~/test", "sa", "")) {

            String sql = "CREATE TABLE ACCOUNT " +
                    "(id INTEGER NOT NULL, " +
                    "email VARCHAR(255), " +
                    "password VARCHAR(255), " +
                    "PRIMARY KEY (id))";

            Statement statement = connection.createStatement();
            statement.execute(sql);

            /**
            * PreparedStatement preparedStatement = connection.prepareStatement(sql);
            * ResultSet resultSet = statement.executeQuery(sql);
            **/
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
}
