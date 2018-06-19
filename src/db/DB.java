package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by think on 2017/12/4.
 */
public class DB {
    public static Connection conn;
  public static Connection getConnection()
  {
      try {
          Class.forName("org.gjt.mm.mysql.Driver");
          String URL="jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=UTF-8";
          conn= DriverManager.getConnection(URL,"root","root");
      } catch (Exception e) {
          e.printStackTrace();
      }

return conn;
  }

  public static void closeConnection(){
      if (conn!=null)
      {
          try {
              conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
  }
}
