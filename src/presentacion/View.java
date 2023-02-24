
package presentacion;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;
import negocio.nRol;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.nUsuario;

public class View extends javax.swing.JFrame {

    DefaultTableModel modelo;
    public View() {
        initComponents();
        setLocationRelativeTo(null);
        Cursor();
        mostrarDatos("");

    }
    
    public void mostrarDatos(String dato){
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("ROL");
        nRol nrol= new nRol();
        ResultSet rs = nrol.nListarRol();
        String roles [] = new String[2];
        if (dato.equals("")) {
            try {
                while (rs.next()) {
                    roles[0] = rs.getString("id");
                    roles[1] = rs.getString("nombre");
                    modelo.addRow(roles);
                    tableRoles.setModel(modelo);
                }
            } catch (SQLException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btn_Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btn_Crear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnADM = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoles = new javax.swing.JTable();
        btn_Modificar_Rol = new javax.swing.JButton();
        btn_Eliminar_Rol = new javax.swing.JButton();
        btn_Nuevo_Rol = new javax.swing.JButton();
        txtbuscarRol = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btn_Nuevo_Usuario = new javax.swing.JButton();
        txtbuscarUsuario = new javax.swing.JTextField();
        btn_Eliminar_Usuario = new javax.swing.JButton();
        btn_Modificar_Usuario = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnombrerol = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Registrar_rol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoClinica.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 300, 100));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/top_blanco.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 830, 70));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 36, 229));
        jLabel2.setText("Iniciar sesión");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 30));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtemail.setForeground(new java.awt.Color(153, 153, 153));
        txtemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtemail.setText("Correo electrónico");
        txtemail.setAlignmentX(1.0F);
        txtemail.setMargin(new java.awt.Insets(2, 8, 2, 2));
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 380, 40));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(153, 153, 153));
        txtpassword.setText("Contraseña");
        txtpassword.setMargin(new java.awt.Insets(2, 8, 2, 2));
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 380, 40));

        btn_Ingresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(51, 51, 51));
        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_IngresarMouseClicked(evt);
            }
        });
        jPanel2.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 90, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("¿Aun no te has registrado?  ");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Crear una cuenta");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 110, 20));

        jTabbedPane2.addTab("tab1", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Crear una cuenta");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(153, 153, 153));
        txtnombre.setText("Nombre");
        txtnombre.setMargin(new java.awt.Insets(2, 8, 2, 2));
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });
        jPanel4.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, 40));

        txtapellido.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(153, 153, 153));
        txtapellido.setText("Apellido");
        txtapellido.setMargin(new java.awt.Insets(2, 8, 2, 2));
        txtapellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtapellidoFocusLost(evt);
            }
        });
        jPanel4.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 260, 40));

        txtcorreo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtcorreo.setText("Correo electrónico");
        txtcorreo.setMargin(new java.awt.Insets(2, 8, 2, 2));
        txtcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcorreoFocusLost(evt);
            }
        });
        jPanel4.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 260, 40));

        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtpass.setForeground(new java.awt.Color(153, 153, 153));
        txtpass.setText("Contraseña");
        txtpass.setMargin(new java.awt.Insets(2, 8, 2, 2));
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassFocusLost(evt);
            }
        });
        jPanel4.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 270, 40));

        btn_Crear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Crear.setText("Crear");
        btn_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrearMouseClicked(evt);
            }
        });
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("¿Ya tienes una cuenta?");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Ingresar");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 80, 20));

        jTabbedPane2.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Hola mundo");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 190));

        btnADM.setText("ADM");
        btnADM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnADMMouseClicked(evt);
            }
        });
        jPanel5.add(btnADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jTabbedPane2.addTab("tab3", jPanel5);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Gestion del rol");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tableRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableRoles);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 130));

        btn_Modificar_Rol.setBackground(new java.awt.Color(255, 0, 0));
        btn_Modificar_Rol.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar_Rol.setText("MODIFICAR");
        btn_Modificar_Rol.setBorder(null);
        jPanel7.add(btn_Modificar_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 140, 30));

        btn_Eliminar_Rol.setBackground(new java.awt.Color(51, 51, 255));
        btn_Eliminar_Rol.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar_Rol.setText("ELIMINAR");
        btn_Eliminar_Rol.setBorder(null);
        jPanel7.add(btn_Eliminar_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 140, 30));

        btn_Nuevo_Rol.setBackground(new java.awt.Color(51, 51, 255));
        btn_Nuevo_Rol.setForeground(new java.awt.Color(255, 255, 255));
        btn_Nuevo_Rol.setText("NUEVO");
        btn_Nuevo_Rol.setBorder(null);
        btn_Nuevo_Rol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Nuevo_RolMouseClicked(evt);
            }
        });
        jPanel7.add(btn_Nuevo_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 120, 30));
        jPanel7.add(txtbuscarRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 310, 30));

        jTabbedPane2.addTab("tab4", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableUsuario);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 600, 130));

        jLabel11.setBackground(new java.awt.Color(51, 51, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Usuario");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btn_Nuevo_Usuario.setBackground(new java.awt.Color(51, 51, 255));
        btn_Nuevo_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Nuevo_Usuario.setText("NUEVO");
        btn_Nuevo_Usuario.setBorder(null);
        jPanel8.add(btn_Nuevo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, 30));
        jPanel8.add(txtbuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 470, 30));

        btn_Eliminar_Usuario.setBackground(new java.awt.Color(51, 51, 255));
        btn_Eliminar_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar_Usuario.setText("ELIMINAR");
        btn_Eliminar_Usuario.setBorder(null);
        jPanel8.add(btn_Eliminar_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 140, 30));

        btn_Modificar_Usuario.setBackground(new java.awt.Color(255, 0, 0));
        btn_Modificar_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar_Usuario.setText("MODIFICAR");
        btn_Modificar_Usuario.setBorder(null);
        jPanel8.add(btn_Modificar_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 30));

        jTabbedPane2.addTab("tab5", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Registro de roles");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 44, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Cargo");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        txtnombrerol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombrerol.setBorder(null);
        jPanel9.add(txtnombrerol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 210, 30));
        jPanel9.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 210, 30));

        btn_Registrar_rol.setBackground(new java.awt.Color(0, 51, 255));
        btn_Registrar_rol.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar_rol.setText("REGISTRAR");
        btn_Registrar_rol.setBorder(null);
        btn_Registrar_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Registrar_rolActionPerformed(evt);
            }
        });
        jPanel9.add(btn_Registrar_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 130, 30));

        jTabbedPane2.addTab("tab6", jPanel9);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 810, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Cursor(){
        btn_Ingresar.setCursor(new Cursor(HAND_CURSOR) {
        });
        jPanel3.setCursor(new Cursor(HAND_CURSOR) {
        });
        jPanel6.setCursor(new Cursor(HAND_CURSOR) {
        });
        btn_Crear.setCursor(new Cursor(HAND_CURSOR) {
        });
    }
    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        if (txtemail.getText().equals("Correo electrónico")) {
            txtemail.setText("");
            txtemail.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        if (txtemail.getText().equals("")) {
            txtemail.setText("Correo electrónico");
            txtemail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        if (txtpassword.getText().equals("Contraseña")) {
            txtpassword.setText("");
            txtpassword.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        if (txtpassword.getText().equals("")) {
            txtpassword.setText("Contraseña");
            txtpassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        if (txtnombre.getText().equals("Nombre")) {
            txtnombre.setText("");
            txtnombre.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        if (txtnombre.getText().equals("")) {
            txtnombre.setText("Nombre");
            txtnombre.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtapellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapellidoFocusGained
        if (txtapellido.getText().equals("Apellido")) {
            txtapellido.setText("");
            txtapellido.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtapellidoFocusGained

    private void txtapellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapellidoFocusLost
        if (txtapellido.getText().equals("")) {
            txtapellido.setText("Apellido");
            txtapellido.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtapellidoFocusLost

    private void txtcorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusGained
        if (txtcorreo.getText().equals("Correo electrónico")) {
            txtcorreo.setText("");
            txtcorreo.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtcorreoFocusGained

    private void txtcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusLost
        if (txtcorreo.getText().equals("")) {
            txtcorreo.setText("Correo electrónico");
            txtcorreo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtcorreoFocusLost

    private void txtpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusGained
        if (txtpass.getText().equals("Contraseña")) {
            txtpass.setText("");
            txtpass.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtpassFocusGained

    private void txtpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusLost
        if (txtpass.getText().equals("")) {
            txtpass.setText("Contraseña");
            txtpass.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_txtpassFocusLost

    private void btn_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IngresarMouseClicked

        jTabbedPane2.setSelectedIndex(2);
        
    }//GEN-LAST:event_btn_IngresarMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        jTabbedPane2.setSelectedIndex(1);
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void btn_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrearMouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btn_CrearMouseClicked

    private void btnADMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnADMMouseClicked
        String nombre = txtnombre.getText().toUpperCase();
        String apellido = txtapellido.getText().toUpperCase();
        String correo = txtcorreo.getText();
        String pass = txtpass.getText();
        nUsuario user = new nUsuario();
        user.nAgregarUsuario(nombre, apellido, correo, pass, 2);
        mostrarDatos("");
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_btnADMMouseClicked

    private void btn_Registrar_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Registrar_rolActionPerformed
        String nombre = txtnombrerol.getText().toUpperCase();
        nRol nrol = new nRol();
        nrol.nAgregarRol(nombre);
        jTabbedPane2.setSelectedIndex(3);
        mostrarDatos("");
    }//GEN-LAST:event_btn_Registrar_rolActionPerformed

    private void btn_Nuevo_RolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Nuevo_RolMouseClicked
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_btn_Nuevo_RolMouseClicked

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        
    }//GEN-LAST:event_btn_CrearActionPerformed

    public void modificarRol(){
        int fila = tableRoles.getSelectedRow();
        if (fila >= 0) {
            String id = tableRoles.getValueAt(fila, 0).toString();
            String nombre = tableRoles.getValueAt(fila, 1).toString().toUpperCase();
            nRol nrol = new nRol();
            nrol.nModificarRol(id, nombre);
            mostrarDatos("");
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }
    public void eliminarRol(){
        int fila = tableRoles.getSelectedRow();
        if (fila >= 0) {
            String id = tableRoles.getValueAt(fila, 0).toString();
            nRol nrol = new nRol();
            nrol.nElimnarRol(id);
            mostrarDatos("");
        }
    }
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADM;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Eliminar_Rol;
    private javax.swing.JButton btn_Eliminar_Usuario;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Modificar_Rol;
    private javax.swing.JButton btn_Modificar_Usuario;
    private javax.swing.JButton btn_Nuevo_Rol;
    private javax.swing.JButton btn_Nuevo_Usuario;
    private javax.swing.JButton btn_Registrar_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tableRoles;
    private javax.swing.JTable tableUsuario;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscarRol;
    private javax.swing.JTextField txtbuscarUsuario;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrerol;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
