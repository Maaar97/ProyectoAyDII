/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariano
 */
public class Login extends javax.swing.JFrame {

    
    boolean vacio;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        FrameRegistro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        FrameRegistro.setSize(360, 450);
        FrameRegistro.setResizable(false);
        FrameRegistro.setLocationRelativeTo(null);
        FrameRegistro.setVisible(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        try {
            if(UsuarioBD.buscarAdmin()==0){
                FrameRegistro.setVisible(true);
                vacio = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameRegistro = new javax.swing.JFrame();
        PanelRegistro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        Administrador = new javax.swing.JCheckBox();
        Registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        DatosUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        NombreUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Ver1 = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();
        Contraseña = new javax.swing.JPasswordField();
        NuevoUsuario = new javax.swing.JButton();

        PanelRegistro.setBackground(new java.awt.Color(0, 61, 141));
        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro");
        PanelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        PanelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        PanelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 61, 141));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        PanelRegistro.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 210, -1));
        PanelRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 20));

        jPasswordField1.setBackground(new java.awt.Color(0, 61, 141));
        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        PanelRegistro.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 210, -1));
        PanelRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ver.png"))); // NOI18N
        PanelRegistro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 40, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar Contraseña");
        PanelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(0, 61, 141));
        jPasswordField2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(null);
        PanelRegistro.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, -1));
        PanelRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 240, 20));

        Administrador.setBackground(new java.awt.Color(0, 61, 141));
        Administrador.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Administrador.setForeground(new java.awt.Color(255, 255, 255));
        Administrador.setText("Administrador");
        PanelRegistro.add(Administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        Registrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Registrar.setText("Registrar Usuario");
        PanelRegistro.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ver.png"))); // NOI18N
        PanelRegistro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 40, 30));

        javax.swing.GroupLayout FrameRegistroLayout = new javax.swing.GroupLayout(FrameRegistro.getContentPane());
        FrameRegistro.getContentPane().setLayout(FrameRegistroLayout);
        FrameRegistroLayout.setHorizontalGroup(
            FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        FrameRegistroLayout.setVerticalGroup(
            FrameRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setName("Fondo"); // NOI18N

        DatosUsuario.setBackground(new java.awt.Color(0, 61, 141));
        DatosUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar");
        DatosUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        DatosUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        DatosUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        DatosUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 20));

        NombreUsuario.setBackground(new java.awt.Color(0, 61, 141));
        NombreUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuario.setBorder(null);
        NombreUsuario.setNextFocusableComponent(Contraseña);
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });
        DatosUsuario.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 30));
        DatosUsuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, 20));

        Ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ver.png"))); // NOI18N
        Ver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ver1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Ver1MouseReleased(evt);
            }
        });
        DatosUsuario.add(Ver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 40, 30));

        Ingresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Ingresar.setText("Ingresar");
        DatosUsuario.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        Contraseña.setBackground(new java.awt.Color(0, 61, 141));
        Contraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setBorder(null);
        Contraseña.setNextFocusableComponent(Ingresar);
        DatosUsuario.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, -1));

        NuevoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        NuevoUsuario.setText("Registrar Nuevo Usuario");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(NuevoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(DatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(NuevoUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void Ver1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver1MousePressed
        Contraseña.setEchoChar((char)0);
    }//GEN-LAST:event_Ver1MousePressed

    private void Ver1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver1MouseReleased
        Contraseña.setEchoChar('*');
    }//GEN-LAST:event_Ver1MouseReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Administrador;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JPanel DatosUsuario;
    private javax.swing.JPanel Fondo;
    private javax.swing.JFrame FrameRegistro;
    private javax.swing.JButton Ingresar;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JButton NuevoUsuario;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Ver1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
