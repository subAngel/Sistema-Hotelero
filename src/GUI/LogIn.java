/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author angel
 */
public class LogIn extends javax.swing.JFrame {

    Font roboto = new Font("Roboto", Font.BOLD, 24);
    
    public class Imagen extends javax.swing.JPanel{
        public Imagen(){
            this.setSize(300,800);
        }   
    
        public void paint(Graphics grafico){
            Dimension height = getSize();
            ImageIcon img = new ImageIcon(getClass().getResource("\\imagenes\\img-habitacion.jpg"));
            grafico.drawImage(img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(true);
            super.paintComponent(grafico);
        }
    }
   
    /**
     * Creates new form LogIn
     */
    public LogIn() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        lbl_logo.setOpaque(false);
        lbl_titulo_hotel.setOpaque(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_titulo_hotel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_background.setBackground(new java.awt.Color(40, 42, 54));
        panel_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 248, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lbl_logo.setForeground(new java.awt.Color(80, 250, 123));
        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/san-miguel.png"))); // NOI18N
        lbl_logo.setText("Hotel San Miguel");
        lbl_logo.setOpaque(true);
        jPanel1.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 410, 480));

        lbl_titulo_hotel.setBackground(new java.awt.Color(255, 255, 255));
        lbl_titulo_hotel.setFont(new java.awt.Font("Roboto Black", 1, 42)); // NOI18N
        lbl_titulo_hotel.setForeground(new java.awt.Color(80, 250, 123));
        lbl_titulo_hotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo_hotel.setText("Hotel San Miguel");
        lbl_titulo_hotel.setOpaque(true);
        jPanel1.add(lbl_titulo_hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 410, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img-habitacion.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        panel_background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 460, 770));

        jPanel2.setBackground(new java.awt.Color(40, 42, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(68, 71, 90));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 248, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO DE SESIÓN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 320, 55));

        jLabel3.setBackground(new java.awt.Color(68, 71, 90));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 242));
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 363, 325, 55));

        jSeparator1.setBackground(new java.awt.Color(80, 250, 123));
        jSeparator1.setForeground(new java.awt.Color(80, 250, 123));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 460, 10));

        jSeparator2.setBackground(new java.awt.Color(80, 250, 123));
        jSeparator2.setForeground(new java.awt.Color(80, 250, 123));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 460, 10));

        jLabel5.setBackground(new java.awt.Color(68, 71, 90));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 242));
        jLabel5.setText("Usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 203, 325, 55));

        txt_usuario.setBackground(new java.awt.Color(68, 71, 90));
        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(248, 248, 242));
        txt_usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 460, 47));

        txt_pass.setBackground(new java.awt.Color(68, 71, 90));
        txt_pass.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(248, 248, 242));
        txt_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 460, 50));

        jButton1.setBackground(new java.awt.Color(80, 250, 123));
        jButton1.setFont(new java.awt.Font("Roboto", 3, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(98, 114, 164));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 170, 50));

        panel_background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 540, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            ConexionMySQL Con = new ConexionMySQL();
            String u = txt_usuario.getText();
            String p = txt_pass.getText();
            //String rol = txt_rol.getSelectedItem().toString();

            Con.ConectarBasedeDatos();

            String SQL = "select username, password, rol from hotel.empleado where username='" + u + "';";
            
            Connection con = Con.getConnection();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                // si el usuario existe
                String usr = rs.getString("username");
                String pass = rs.getString("password");
                String rol = rs.getString("rol");
                
                if(p.equals(pass)){
                    // Vamos a su respectiva ventana
                    if (rol.equals("3")){
                        this.dispose();
                        FrameAdmin admin = new FrameAdmin();
                        admin.setVisible(true);
                    } else if (rol.equals("2")){
                        JOptionPane.showMessageDialog(null, "Aun no se ha creado esta funcionalidad...");
                        txt_usuario.setText("");
                        txt_pass.setText("");
                    } else if (rol.equals("1")){
                        this.dispose();
                        FrameRecepcionista recepcionista = new FrameRecepcionista();
                        recepcionista.setVisible(true);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Contrasena incorrecta.");
                }
                
            } else {
                //El usuario no existe
                JOptionPane.showMessageDialog(null, "El usuario no existe en la base de datos. " + rs);
            }
//            if (rol== "Administrador" ){
//
//                Con.resultado = Con.sentencia.executeQuery(SQL);
//                if(Con.resultado.next()){
//                    setVisible(false);
//                    FrameAdmin admi = new FrameAdmin();
//
//                    admi.setVisible(true);
//                }else{
//                    JOptionPane.showMessageDialog(null,"Datos incorrectos");
//                }
//
//            }else if(rol== "Recepcionista" ){
//
//                Con.resultado = Con.sentencia.executeQuery(SQL);
//                if(Con.resultado.next()){
//                    setVisible(false);
//                    FrameRecepcionista rece = new  FrameRecepcionista();
//
//                    rece.setVisible(true);
//                }else{
//                    JOptionPane.showMessageDialog(null,"Datos incorrectos");
//                }
//
//            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            UIManager.setLookAndFeel(new MaterialLookAndFeel()); //</editor-fold>
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_titulo_hotel;
    private javax.swing.JPanel panel_background;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
