/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ApplicationProject;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author novad
 */
public class LoginFrame extends JFrame {

    /** Creates new form LoginFrame */
    public LoginFrame() {
        initComponents();
        setTitle("Login Page");
        setLocationRelativeTo(null);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginUserInput = new javax.swing.JTextField();
        LoginPasswordInput = new javax.swing.JPasswordField();
        UserLoginLabel = new javax.swing.JLabel();
        PasswordLoginLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        LoginPanel1 = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        HeaderLabel1 = new javax.swing.JLabel();
        GambarLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        LoginUserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUserInputActionPerformed(evt);
            }
        });

        LoginPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordInputActionPerformed(evt);
            }
        });

        UserLoginLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        UserLoginLabel.setForeground(new java.awt.Color(51, 153, 255));
        UserLoginLabel.setText("Username");

        PasswordLoginLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        PasswordLoginLabel.setForeground(new java.awt.Color(51, 153, 255));
        PasswordLoginLabel.setText("Password");

        LoginButton.setBackground(new java.awt.Color(0, 102, 255));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LoginPanel1.setBackground(new java.awt.Color(255, 204, 51));

        HeaderLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        HeaderLabel.setText("CAR WASH");

        HeaderLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        HeaderLabel1.setText("SYSTEM");

        javax.swing.GroupLayout LoginPanel1Layout = new javax.swing.GroupLayout(LoginPanel1);
        LoginPanel1.setLayout(LoginPanel1Layout);
        LoginPanel1Layout.setHorizontalGroup(
            LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(HeaderLabel1))
                    .addComponent(HeaderLabel))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        LoginPanel1Layout.setVerticalGroup(
            LoginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HeaderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        GambarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationProject/istockphoto-1254558218-612x612.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserLoginLabel)
                            .addComponent(PasswordLoginLabel))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LoginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(GambarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLoginLabel)
                    .addComponent(LoginUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLoginLabel))
                .addGap(27, 27, 27)
                .addComponent(LoginButton)
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(GambarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginPasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginPasswordInputActionPerformed

    private void LoginUserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUserInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginUserInputActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String Username = LoginUserInput.getText();
        String Password = LoginPasswordInput.getText();
        
        if(Username.equals("Admin") && Password.equals("Admin")){
        new MainMenu().setVisible(true);
        this.dispose();
        }
        else{
        JOptionPane.showMessageDialog(null, "Username atau Password anda salah!!!");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GambarLogin;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel HeaderLabel1;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel1;
    private javax.swing.JPasswordField LoginPasswordInput;
    private javax.swing.JTextField LoginUserInput;
    private javax.swing.JLabel PasswordLoginLabel;
    private javax.swing.JLabel UserLoginLabel;
    // End of variables declaration//GEN-END:variables

}
