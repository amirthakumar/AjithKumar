package in.vamsoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckLogin {

  public static boolean check(String name, String password) {

    try {
      Class.forName("org.postgresql.Driver");
      Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.10.123:5432/sudhadb",
          "sudhavam", "$UDH@123");
      PreparedStatement preparedStatement = connection.prepareStatement("select username ,password from login");
      ResultSet rs = preparedStatement.executeQuery();
      while (rs.next()) {
        while(rs.getString(1).equals(name) && rs.getString(2).equals(password)) {
          return true;
        }

      }

    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return false;
  }

}
