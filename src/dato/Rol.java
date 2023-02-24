
package dato;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rol extends conexion.ConnecterBD{
    private String description;

    public Rol(String description) {
        this.description = description;
    }

    public Rol() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    //Crear los AMB
    public boolean agregarRol(Rol roles){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "insert into roles (nombre) value (?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, roles.getDescription());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Rol.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean modificarRol(String id, Rol roles){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "update roles set nombre = ? where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, roles.getDescription());
            ps.setString(2, id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Rol.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean eliminarRol(String id){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "delete from roles where id = ' "+id+" '";
        
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Rol.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //Almacenar los resultado de una sentencia de sql
    public ResultSet listarRoles(){
        PreparedStatement ps;
        ResultSet resultSet = null;
        //resultSet = contiene los resultados de una sentencia sql
        Connection con = getConnection();
        String sql = "select * from roles";
        
        try {
            ps = con.prepareStatement(sql);
            resultSet = ps.executeQuery();
            //executeQuery = para obtener un conjunto de resultados de una
            //llamada de procedimiento almacenado
        } catch (SQLException ex) {
            Logger.getLogger(Rol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
}
