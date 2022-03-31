import java.sql.*;

public class DBConnection {

  public static void main(String[] args) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con = DriverManager.getConnection("jdbc:odbc:DSN");
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from Bio");
      while (rs.next()) {
        System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t " + rs.getString(3) + "\t" + rs.getString(4));
      }
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
