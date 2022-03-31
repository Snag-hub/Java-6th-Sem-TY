//Write a JDBC Program in java to display the names of Employees starting with ‘S’ character.

import java.sql.*;

class Slip21A {
  public static void main(String[] args) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection conn = DriverManager.getConnection("jdbc:odbc:DSN");
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("select * from Bio where ename like 'S%'");
      while (rs.next()) {
        System.out
            .println(rs.getString(1) + "\t " + rs.getString(2) + " \t" + rs.getString(3) + " \t" + rs.getString(4));
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}