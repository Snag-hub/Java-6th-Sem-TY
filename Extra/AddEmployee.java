import java.sql.*;
import java.util.Scanner;

public class AddEmployee {
  public static void main(String[] args) {
    try{
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con = DriverManager.getConnection("jdbc:odbc:DSN");
      Statement stmt = con.createStatement();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Employee ID");
      int id = sc.nextInt();
      System.out.println("Enter Employee Name");
      String name = sc.next();
      System.out.println("Enter Employee Salary");
      int salary = sc.nextInt();
      System.out.println("Enter Employee Department");
      String dept = sc.next();
      String query = "insert into Bio values("+id+",'"+name+"',"+salary+" ,'"+dept+"')";
      int rs = stmt.executeUpdate(query);
      if(rs>0){
        System.out.println("Employee Added");
      }
      con.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
