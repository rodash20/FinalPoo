

package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entidades.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Frognas
 */
public class DBQuery {

    private Conexion conexion;

    public DBQuery(){
        conexion = new Conexion();
    }
    
    public boolean registrarUsuario(String nombre, String contraseña) throws SQLException{

        String query = "INSERT INTO usuario (nombre, contraseña) VALUES (?,?)";
        String password = MD5(contraseña);
        try{
            Connection con = conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, nombre);
            pstm.setString(2, password);
            
            if(pstm.executeUpdate() > 0){
                return true;
            }
        } catch(Exception error){
            error.printStackTrace();
            return false;
        } 
        
        return true;
    }

    public Usuario login(String nombre, String contraseña) throws SQLException{
        boolean flag = false;
        Usuario usuario = new Usuario();
        String query = "SELECT * FROM usuario WHERE nombre = ? AND contraseña = ?";
        try{
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                usuario.setUsername(rs.getString("nombre"));
                usuario.setPassword(rs.getString("contraseña"));
                flag = true;
            }
            if (!flag) usuario = null;
        } catch(SQLException e){
            usuario = null;
            e.printStackTrace();
        }
        return usuario;
    }
   
    public String MD5(String md5){
        try{
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
             byte[] array = md.digest(md5.getBytes());
             StringBuffer sb = new StringBuffer();
             for (int i = 0; i < array.length; ++i) {
               sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch(java.security.NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }
      
        
       public boolean añadirRonda(int p1, int p2, int p3) throws SQLException{
        String query = "INSERT INTO ronda (tiro1,tiro2,tiro3) VALUES (?,?,?)";
        try{
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, p1);
            ps.setInt(2, p2);
            ps.setInt(3, p3);
            
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
        
   
   
}
