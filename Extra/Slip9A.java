//Write a JDBC program to delete the records of employees whose names are starts with A character. 

import java.sql.*;

public class Slip9A {
  public static void main(String[] args) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection conn = DriverManager.getConnection("jdbc:odbc:DSN");
      Statement stmt = conn.createStatement();
      String sql = "SELECT * FROM Bio where ename like 'A%'";
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
