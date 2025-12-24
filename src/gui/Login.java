package gui;

import model.User;
import dao.UserDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    UserDao u = new UserDao();
    
    
    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        welcome = new javax.swing.JLabel();
        uesrname = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        createAccountButtton = new com.k33ptoo.components.KButton();
        loginButton = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        kGradientPanel1.setkEndColor(new java.awt.Color(43, 48, 132));
        kGradientPanel1.setkStartColor(new java.awt.Color(76, 212, 202));
        kGradientPanel1.setLayout(new java.awt.GridBagLayout());

        welcome.setFont(new java.awt.Font("Microsoft YaHei", 0, 50)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome !");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 35, 0, 0);
        kGradientPanel1.add(welcome, gridBagConstraints);

        uesrname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uesrname.setForeground(new java.awt.Color(255, 255, 255));
        uesrname.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 130, 0, 0);
        kGradientPanel1.add(uesrname, gridBagConstraints);

        password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 130, 0, 0);
        kGradientPanel1.add(password, gridBagConstraints);

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameField.setBorder(null);
        usernameField.setMaximumSize(new java.awt.Dimension(64, 20));
        usernameField.addActionListener(this::usernameFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 273;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 18, 0, 89);
        kGradientPanel1.add(usernameField, gridBagConstraints);

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setMaximumSize(new java.awt.Dimension(64, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 273;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 18, 0, 89);
        kGradientPanel1.add(passwordField, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/k.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 88, 0, 0);
        kGradientPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start learning with edu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 35, 0, 0);
        kGradientPanel1.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        kGradientPanel1.add(kGradientPanel2, gridBagConstraints);

        createAccountButtton.setBorder(null);
        createAccountButtton.setText("Create account");
        createAccountButtton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createAccountButtton.setkBackGroundColor(new java.awt.Color(82, 164, 221));
        createAccountButtton.setkEndColor(new java.awt.Color(24, 51, 100));
        createAccountButtton.setkHoverEndColor(new java.awt.Color(32, 51, 64));
        createAccountButtton.setkHoverForeGround(new java.awt.Color(88, 158, 164));
        createAccountButtton.setkHoverStartColor(new java.awt.Color(88, 139, 181));
        createAccountButtton.setkSelectedColor(new java.awt.Color(122, 175, 203));
        createAccountButtton.setkStartColor(new java.awt.Color(67, 165, 165));
        createAccountButtton.setMaximumSize(new java.awt.Dimension(121, 35));
        createAccountButtton.setPreferredSize(new java.awt.Dimension(121, 35));
        createAccountButtton.addActionListener(this::createAccountButttonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 27, 0, 0);
        kGradientPanel1.add(createAccountButtton, gridBagConstraints);

        loginButton.setBorder(null);
        loginButton.setText("Login");
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setkBackGroundColor(new java.awt.Color(82, 164, 221));
        loginButton.setkEndColor(new java.awt.Color(24, 51, 100));
        loginButton.setkHoverEndColor(new java.awt.Color(32, 51, 64));
        loginButton.setkHoverForeGround(new java.awt.Color(88, 158, 164));
        loginButton.setkHoverStartColor(new java.awt.Color(88, 139, 181));
        loginButton.setkSelectedColor(new java.awt.Color(122, 175, 203));
        loginButton.setkStartColor(new java.awt.Color(67, 165, 165));
        loginButton.setMaximumSize(new java.awt.Dimension(121, 35));
        loginButton.setPreferredSize(new java.awt.Dimension(121, 35));
        loginButton.addActionListener(this::loginButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 18, 156, 0);
        kGradientPanel1.add(loginButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText().trim();
        String pass = new String(passwordField.getPassword());
        
        if (username.isEmpty() || pass.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter username and password!");
            return;
        }
        
        User user = u.login(username, pass);
        
        if (user == null) {
            JOptionPane.showMessageDialog(this, "Wrong username or password!");
        }
        
        if (user.getRole().equalsIgnoreCase("admin")) {
            this.setVisible(false);
            AdminDashboard a = new AdminDashboard(username);
            a.setVisible(true);
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createAccountButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAccountButttonActionPerformed
    
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton createAccountButtton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KButton loginButton;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel uesrname;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
