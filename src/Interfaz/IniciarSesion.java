/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import entidades.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import sql.DBQuery;



/**
 *
 * @author Frognas
 */
public class IniciarSesion extends javax.swing.JFrame {
    Color color;

    /**
     * Creates new form Login
     */
    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelIncorrecto.setVisible(false);
        
        
    }

    public void limpiarCampos(){
        jTextUsuario.setText("");
        jTextContraseña.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIniciarSesion = new javax.swing.JLabel();
        jLabelCrearCuenta = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jTextContraseña = new javax.swing.JPasswordField();
        jLabelIncorrecto = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelUsuario1 = new javax.swing.JLabel();
        jLabelGlobo = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iniciar.png"))); // NOI18N
        jLabelIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIniciarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 200, 80));

        jLabelCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crearcuenta.png"))); // NOI18N
        jLabelCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCrearCuentaMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 200, 80));

        jTextUsuario.setBackground(new java.awt.Color(0, 28, 75));
        jTextUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextUsuario.setBorder(null);
        getContentPane().add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 350, 30));

        jTextContraseña.setBackground(new java.awt.Color(0, 28, 75));
        jTextContraseña.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jTextContraseña.setBorder(null);
        jTextContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 360, 30));

        jLabelIncorrecto.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelIncorrecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIncorrecto.setText("Datos incorrectos!");
        getContentPane().add(jLabelIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 150, 60));

        jLabelContraseña.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabelUsuario1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabelUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario1.setText("Iniciar sesión");
        getContentPane().add(jLabelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabelGlobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TextBubble.png"))); // NOI18N
        getContentPane().add(jLabelGlobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 310, 230));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 440, 430));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContraseñaActionPerformed

    private void jLabelCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCrearCuentaMouseClicked
        // TODO add your handling code here:
        new CrearCuenta().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCrearCuentaMouseClicked

    private void jLabelIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIniciarSesionMouseClicked
        // TODO add your handling code here:
        
        DBQuery query = new DBQuery();
        
        try{
            Usuario user = query.login(jTextUsuario.getText(), query.MD5(new String(jTextContraseña.getPassword())));
            if (user != null) {
                limpiarCampos();
                setVisible(false);
               new Menu(user).setVisible(true);
            } else{
                limpiarCampos();
                jLabelIncorrecto.setVisible(true);
            }
            
        } catch(SQLException e){
            jLabelIncorrecto.setVisible(true);
        }

       
    }//GEN-LAST:event_jLabelIniciarSesionMouseClicked
              

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGlobo;
    private javax.swing.JLabel jLabelIncorrecto;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPasswordField jTextContraseña;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}