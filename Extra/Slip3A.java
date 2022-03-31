
//Write a JDBC program to display the details of employees (eno, ename, department, sal) whose department is Computer Science.
import java.sql.*;

public class Slip3A {
  public static void main(String[] args) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection conn = DriverManager.getConnection("jdbc:odbc:DSN");
      Statement stmt = conn.createStatement();
      String sql = "select * from Bio where dept = 'Computer Science'";
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        System.out
            .println(rs.getString(1) + " \t" + rs.getString(2) + " \t" + rs.getString(3) + " \t" + rs.getString(4));
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
