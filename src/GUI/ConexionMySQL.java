/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author usuario
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

    public void ConectarBasedeDatos() {
        try {
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/hotel";
            conexion = DriverManager.getConnection(url_bd,"admin","admin");
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public ResultSet consulta(String consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
        return rs;
    }
    
  public ResultSet accion(String consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.executeUpdate();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
        return rs;
    }
   public ResultSet asignarPriv(String query){
       ResultSet rs = null;
       try {
           PreparedStatement ps = conexion.prepareStatement(query);
           ps.executeUpdate();
           //System.out.println("Usuario creado y priviegios otorgados");
           
       } catch (Exception e) {
           //System.err.println("Error al crear el usuario....");
       }
       return rs;
   }
   public ResultSet agregar(String consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.executeUpdate();
            
         JOptionPane.showMessageDialog(null, "Se agregó correctamente");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
        return rs;
    }
     
   public ResultSet eliminar(String consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.executeUpdate();
            
      
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
        return rs;
    }
   
   
   
   
   
   

     
    public void DesconectarBasedeDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return conexion;
    }
}