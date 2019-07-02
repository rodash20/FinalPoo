

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
                usuario.setIdUsuario(rs.getInt("id"));
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
      
        

       
        
        public List<Ronda> Rondas(String userId) throws SQLException{
           conexion = new Conexion();
           Connection conn = conexion.getConnection();
           List<Ronda> listp = new ArrayList<>();

        
        try{
            String query = "SELECT id, tiro1, tiro2, tiro3 FROM public.rondas where id_usuario="+userId+";";
            PreparedStatement stm = conn.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Ronda p = new Ronda();
                p.setIdRonda(rs.getInt("id"));
                p.setPuntaje1(rs.getInt("tiro1"));
                p.setPuntaje2(rs.getInt("tiro2"));
                p.setPuntaje3(rs.getInt("tiro3"));
               
                listp.add(p);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            conn.close();
        }
        return listp;
    }
   
   
}
