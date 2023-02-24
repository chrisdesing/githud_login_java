
package conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnecterBD {
    private String bd = "farmacia";
    private String url = "jdbc:mysql://localhost:3307/";
    private String user = "root";
    private String password= "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection;  
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url+bd, user, password);
            System.out.println("Se conecto a la base de datos" +" " +bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la conexion");
        }
        return connection;
    }
    
  
}

