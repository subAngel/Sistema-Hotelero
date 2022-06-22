/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class FrameAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrameAdmin
     */
    public FrameAdmin() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_usuarios = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rol_combo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaU = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel_habitaciones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_hab_numero = new javax.swing.JTextField();
        txt_username1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 42, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(40, 42, 54));
        jTabbedPane1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N

        panel_usuarios.setBackground(new java.awt.Color(98, 114, 164));
        panel_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(98, 114, 164));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 250, 123)), "Datos del Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 18), new java.awt.Color(248, 248, 242))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(248, 248, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 248, 242));
        jLabel2.setText("Contraseña:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 33));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 242));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 68, 33));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 248, 242));
        jLabel4.setText("Apellido:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 68, 33));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 242));
        jLabel5.setText("Username:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 33));

        txt_nombre.setBackground(new java.awt.Color(248, 248, 242));
        txt_nombre.setForeground(new java.awt.Color(68, 71, 90));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, -1));

        txt_apellido.setBackground(new java.awt.Color(248, 248, 242));
        txt_apellido.setForeground(new java.awt.Color(68, 71, 90));
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, -1));

        txt_user.setBackground(new java.awt.Color(248, 248, 242));
        txt_user.setForeground(new java.awt.Color(68, 71, 90));
        jPanel3.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        txt_pass.setBackground(new java.awt.Color(248, 248, 242));
        txt_pass.setForeground(new java.awt.Color(68, 71, 90));
        jPanel3.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 248, 242));
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 33));

        txt_telefono.setBackground(new java.awt.Color(248, 248, 242));
        txt_telefono.setForeground(new java.awt.Color(68, 71, 90));
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(248, 248, 242));
        jLabel7.setText("Rol:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, 33));

        txt_email.setBackground(new java.awt.Color(248, 248, 242));
        txt_email.setForeground(new java.awt.Color(68, 71, 90));
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 150, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(248, 248, 242));
        jLabel8.setText("E-mail:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 33));

        rol_combo.setBackground(new java.awt.Color(248, 248, 242));
        rol_combo.setForeground(new java.awt.Color(68, 71, 90));
        rol_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Limpieza" }));
        rol_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rol_comboActionPerformed(evt);
            }
        });
        jPanel3.add(rol_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 444, 240, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, 20));

        panel_usuarios.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 37, 290, 430));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("Mostrar usuarios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_usuarios.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        tablaU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaUMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaU);

        panel_usuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 610, 150));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_usuarios.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 110, -1));

        jButton6.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel_usuarios.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 110, -1));

        jButton7.setBackground(new java.awt.Color(80, 250, 123));
        jButton7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(98, 114, 164));
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel_usuarios.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, -1));

        jButton3.setBackground(new java.awt.Color(80, 250, 123));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(98, 114, 164));
        jButton3.setText("Agregar Usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel_usuarios.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 200, 40));

        jTabbedPane1.addTab("Usuarios", panel_usuarios);

        panel_habitaciones.setBackground(new java.awt.Color(98, 114, 164));
        panel_habitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(98, 114, 164));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 250, 123)), "Datos de la Habitación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 18), new java.awt.Color(248, 248, 242))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(248, 248, 242));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(248, 248, 242));
        jLabel10.setText("Tipo de Habitación");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, 160, 33));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(248, 248, 242));
        jLabel11.setText("Num.De Habitación");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 33));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(248, 248, 242));
        jLabel12.setText("Caracteristicas:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 33));

        txt_hab_numero.setBackground(new java.awt.Color(248, 248, 242));
        txt_hab_numero.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txt_hab_numero.setForeground(new java.awt.Color(68, 71, 90));
        txt_hab_numero.setText("jTextField1");
        jPanel4.add(txt_hab_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, -1));

        txt_username1.setBackground(new java.awt.Color(248, 248, 242));
        txt_username1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txt_username1.setForeground(new java.awt.Color(68, 71, 90));
        txt_username1.setText("jTextField1");
        jPanel4.add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 444, 240, 10));

        jComboBox1.setBackground(new java.awt.Color(248, 248, 242));
        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(68, 71, 90));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(248, 248, 242));
        jLabel16.setText("Precio: ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 33));

        jTextArea1.setBackground(new java.awt.Color(248, 248, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(68, 71, 90));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 300, -1));

        panel_habitaciones.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 37, 340, 430));

        jTable2.setBackground(new java.awt.Color(248, 248, 242));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        panel_habitaciones.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 42, 516, -1));

        jButton2.setBackground(new java.awt.Color(80, 250, 123));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(98, 114, 164));
        jButton2.setText("Ingresar Habitación");
        panel_habitaciones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, 40));

        jTabbedPane1.addTab("Habitaciones", panel_habitaciones);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 940, 590));

        jButton1.setBackground(new java.awt.Color(80, 250, 123));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(98, 114, 164));
        jButton1.setText("Salir");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 680));

        jLabel1.setBackground(new java.awt.Color(68, 71, 90));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 248, 242));
        jLabel1.setText("ADMINISTRADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void rol_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rol_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rol_comboActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ConexionMySQL cn = new ConexionMySQL();

        // ResultSet rs = cn.consulta("SELECT codigo,username,password,nombre,apellido,telefono,email,rol  FROM USUARIO");
        cn.ConectarBasedeDatos();
        ResultSet rs = cn.consulta( "SELECT * FROM hotel.usuario");

        try{
            DefaultTableModel dt = new DefaultTableModel();
            dt.addColumn("Codigo");
            dt.addColumn("Username");
            dt.addColumn("Password");
            dt.addColumn("Nombre");
            dt.addColumn("Apellido");
            dt.addColumn("Telefono");
            dt.addColumn("Email");
            dt.addColumn("Rol");

            while(rs.next()){
                Object[] fila = new Object[8];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);

                dt.addRow(fila);
            }
            tablaU.setModel(dt);

        }catch(Exception ex){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUMousePressed

        int filas;

        filas = tablaU.getSelectedRow();

        String codigo = (String) tablaU.getValueAt(filas, 0);
        String user = (String) tablaU.getValueAt(filas, 1);
        String password = (String) tablaU.getValueAt(filas, 2);
        String nombre = (String) tablaU.getValueAt(filas, 3);
        String apellido = (String) tablaU.getValueAt(filas, 4);
        String telefono = (String) tablaU.getValueAt(filas, 5);
        String email = (String) tablaU.getValueAt(filas, 6);
        String rol = (String) tablaU.getValueAt(filas, 7);

        txt_codigo.setText(codigo);
        txt_user.setText(user);
        txt_pass.setText(password);
        txt_nombre.setText(nombre);
        txt_apellido.setText(apellido);
        txt_telefono.setText(telefono);
        txt_email.setText(email);
        //   rol_combo.selected(rol);
        //  txt_pass.setText(password);

    }//GEN-LAST:event_tablaUMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String us = txt_codigo.getText();

        ConexionMySQL cn = new ConexionMySQL();
        cn.ConectarBasedeDatos();

        ResultSet rs = cn.accion("DELETE FROM USUARIO WHERE CODIGO = '"+us+"'");    //' AND USERNAME = '+"+us+"'"); 

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String codigo=txt_codigo.getText();
        String user=txt_user.getText();
        String pass=txt_pass.getText();
        String nombre=txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String tele = txt_telefono.getText();
        String email = txt_email.getText();
        String rol = rol_combo.getSelectedItem().toString();

        ConexionMySQL cn = new ConexionMySQL();
        cn.ConectarBasedeDatos();

        ResultSet rs = cn.accion("UPDATE USUARIO SET USERNAME = '"+ user+"',PASSWORD = '"+pass+"',NOMBRE = '"+nombre+"',APELLIDO = '"+apellido+"', TELEFONO = '"+ tele+"',EMAIL = '"+ email+"',ROL = '"+ rol+"'   WHERE CODIGO = '"+codigo+"'");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        LogIn a = new LogIn();
        a.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String codigo=txt_codigo.getText();
        String user=txt_user.getText();
        String pass=txt_pass.getText();
        String nombre=txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String tele = txt_telefono.getText();
        String email = txt_email.getText();
        String rol = rol_combo.getSelectedItem().toString();

        ConexionMySQL cn = new ConexionMySQL();
        cn.ConectarBasedeDatos();

        ResultSet rs = cn.agregar("insert into usuario (codigo,username,password,nombre,apellido,telefono,email,rol) values \n" +
            "('"+codigo+"','"+user+"','"+pass+"','"+nombre+"','"+apellido+"','"+tele+"','"+email+"','"+rol+"')");

        /*  ResultSet rs = cn.insertar("insert into usuario (codigo,username,password,nombre,apellido,telefono,email,rol) values \n" +
            "('"+codigo+"',"+user+"',"+pass+"',"+nombre+"',"+apellido+"',"+tele+"',"+email+"'"+rol+"')");*/
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel_habitaciones;
    private javax.swing.JPanel panel_usuarios;
    private javax.swing.JComboBox<String> rol_combo;
    private javax.swing.JTable tablaU;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_hab_numero;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_user;
    private javax.swing.JTextField txt_username1;
    // End of variables declaration//GEN-END:variables
}
