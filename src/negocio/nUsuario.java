
package negocio;
import dato.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
public class nUsuario {
    
    public void nAgregarUsuario(String nombre,String apellido,String email,String pass,int role){
        Usuario user = new Usuario(nombre, apellido, email, pass, role);
        user.agregarUsuarioComun(nombre, apellido, email, pass, role);
           
    }
    
    public void nAgregarUsuarioADM(String nombre,String apellido,String email,String pass,int role){
        Usuario user = new Usuario(nombre, apellido, email, pass, role);
        if (user.agregarUsuarioADM(user)) {
            JOptionPane.showMessageDialog(null, "Agregado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error al agregar");
        }
    }
    
}
