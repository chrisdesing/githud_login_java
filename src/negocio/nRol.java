
package negocio;

import dato.Rol;
import javax.swing.JOptionPane;
import java.sql.*;
public class nRol {
    
    public void nAgregarRol(String nombre){
        Rol rol = new Rol(nombre);
        if (rol.agregarRol(rol)) {
            JOptionPane.showMessageDialog(null, "Rol ingresado");
        }else{
            JOptionPane.showMessageDialog(null, "Error al agregar ");
        }
    }
    public void nModificarRol(String id, String nombre){
        Rol rol = new Rol(nombre);
        if (rol.modificarRol(id, rol)) {
            JOptionPane.showMessageDialog(null, "Modificacion correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }
    }
    public void nElimnarRol(String id){
        Rol rol = new Rol();
        if (rol.eliminarRol(id)) {
            JOptionPane.showMessageDialog(null, "Elimacion correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
    }
    
    
    public ResultSet nListarRol(){
        Rol rol = new Rol();
        return rol.listarRoles();
    }
}
