package in.vamsoft.testutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.vamsoft.db.DbConnection;
import in.vamsoft.model.Student;

public class StudentDaoUtil {

  static final String INSERT_QUERY = "insert into studreg values(id_seq.nextval,?,?)";
  static final String CHECK_QUERY = "select name,password from userdetails1";
  static final Connection con = DbConnection.getConnection();

  public int add(Student stud) {
    try {
      PreparedStatement prepare = con.prepareStatement(INSERT_QUERY);

      prepare.setString(1, stud.getName());
      prepare.setString(2, stud.getPassword());
      int totalCount = prepare.executeUpdate();
      return totalCount;

    } catch (SQLException e) {

      System.err.println("Please Check The Query or Connection " + e);

    }

    return 0;
  }

  public int checkLogin(String name, String password) {
    try {
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(CHECK_QUERY);
      while (rs.next()) {
        if (rs.getString(2).equals(name) && rs.getString(3).equals(password)) {
          return 1;
        }
        
      }

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return 0;

  }

}
