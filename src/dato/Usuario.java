
package dato;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Usuario extends conexion.ConnecterBD{
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private int rol;

    public Usuario(String nombre, String apellido, String email, String password, int rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

   

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
    public boolean agregarUsuarioADM(Usuario usuario){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "insert into usuario (nombre,apellido,email,password,id_rol) values(?,?,?,?) ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getPassword());
            ps.setInt(5, usuario.getRol());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar en la BD");
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean agregarUsuarioComun(String nombre, String apellido,String email,String pass,int rol){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "insert into usuario (nombre,apellido,email,pass,id_rol) values(?,?,?,?,?) ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setString(3, getEmail());
            ps.setString(4, getPassword());
            ps.setInt(5, getRol());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar en la BD");
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean modificarUsuario(String id, Usuario user){
        PreparedStatement ps ;
        Connection con = getConnection();
        String sql = "update usuario nombre = ?,apellido = ?, email = ?, pass = ?, id_rol = ? where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setInt(5, user.getRol());
            ps.setString(6, id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean eliminarUsuario(String id){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "delete from usuario where id = '"+id+"'";
        
        try {
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
