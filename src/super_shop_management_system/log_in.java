package super_shop_management_system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;


public class log_in extends javax.swing.JFrame {

    String name,pass;
    boolean manager=false;
    boolean customer=false;
   
    public log_in() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        ManagerCheckBox = new javax.swing.JCheckBox();
        EmployeeCheckBox = new javax.swing.JCheckBox();
        LogInButton = new javax.swing.JButton();
        RegButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(37, 56, 74));

        jPanel2.setBackground(new java.awt.Color(152, 255, 152));

        jLabel1.setBackground(new java.awt.Color(37, 56, 74));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 56, 74));
        jLabel1.setText("Super Shop Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username  ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password  ");

        NameField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        ManagerCheckBox.setBackground(new java.awt.Color(37, 56, 74));
        ManagerCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ManagerCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        ManagerCheckBox.setText("Manager ");
        ManagerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerCheckBoxActionPerformed(evt);
            }
        });

        EmployeeCheckBox.setBackground(new java.awt.Color(37, 56, 74));
        EmployeeCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmployeeCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeCheckBox.setText("Customer");
        EmployeeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeCheckBoxActionPerformed(evt);
            }
        });

        LogInButton.setBackground(new java.awt.Color(204, 204, 204));
        LogInButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        LogInButton.setText("Log in");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        RegButton.setBackground(new java.awt.Color(204, 204, 204));
        RegButton.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        RegButton.setText("Register");
        RegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrator-64.png"))); // NOI18N

        msg.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        reset.setBackground(new java.awt.Color(37, 56, 74));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(37, 56, 74));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/r.png"))); // NOI18N
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ManagerCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmployeeCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameField)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeeCheckBox)
                            .addComponent(ManagerCheckBox)))
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogInButton)
                    .addComponent(RegButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void RegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegButtonActionPerformed
        dispose();
        register r = new register();
        r.setVisible(true);
    }//GEN-LAST:event_RegButtonActionPerformed

    private void EmployeeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeCheckBoxActionPerformed
       
       if(manager)
       {
           JOptionPane.showMessageDialog(this, "Check either manager or customer");
       }
      
        manager=false;
        customer = true;
       
       
    }//GEN-LAST:event_EmployeeCheckBoxActionPerformed

    private void ManagerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerCheckBoxActionPerformed

        if (customer) {
            JOptionPane.showMessageDialog(this, "Check either manager or customer");

        }

        manager = true;
        customer = false;

    }//GEN-LAST:event_ManagerCheckBoxActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        if (!customer && !manager) {
            JOptionPane.showMessageDialog(this, "Check either manager or customer");
            return;

        }
        name = NameField.getText();
        pass = PasswordField.getText();
        if (manager) {
            if (name.equals("admin") && pass.equals("admin")) {
                ManagerOptions m = new ManagerOptions();
                dispose();
                m.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid information,try again");
            }

        } else if (customer) {
            try {
                String url = "jdbc:mysql://localhost:3306/supershop";
                String username = "root";
                String password = "";

                boolean flag = false;

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection(url, username, password);

                Statement st = con.createStatement();
                ResultSet result;
                String query = "SELECT *FROM customerinfo";

                result = st.executeQuery(query);
                while (result.next()) {

                    String s1, s2;
                    s1 = result.getString("name");
                    s2 = result.getString("password");
                    if (name.equals(s1) && pass.equals(s2)) {
                        dispose();
                        Customer_Order a = new Customer_Order();
                        Bill_info c = new Bill_info();
                        a.setID(result.getInt("id"));
                        a.setVisible(true);
                        flag = true;
                        break;

                    }

                }
                if (flag == false) {
                    JOptionPane.showMessageDialog(this, "Invalid information,try again.Or create new account");
                }

                con.close();
                st.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Invalid information,try again.Or create new account");
            }

        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        name = "";
        pass = "";
        NameField.setText(name);
        PasswordField.setText(pass);
        manager = false;
        customer = false;
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox EmployeeCheckBox;
    private javax.swing.JButton LogInButton;
    private javax.swing.JCheckBox ManagerCheckBox;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton RegButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msg;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
