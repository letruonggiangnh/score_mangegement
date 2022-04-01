/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formmm;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class LoginAccount extends javax.swing.JFrame {

    private ArrayList<TaiKhoanDangNhap> listdn = new ArrayList<>();
    private FileCSV fileLogin = new FileCSV();

    /**
     * Creates new form LoginAccount
     */
    public LoginAccount() {
        initComponents();
        fileLogin.ReadFileLogin(listdn);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogsignup = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nutsignup = new javax.swing.JButton();
        nutacancel = new javax.swing.JButton();
        nhapusername = new javax.swing.JTextField();
        nhappassword = new javax.swing.JPasswordField();
        nhapconfirm = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nhaptendn = new javax.swing.JTextField();
        nhapmatkhau = new javax.swing.JPasswordField();
        chkRemember = new javax.swing.JCheckBox();
        nutlogin = new javax.swing.JButton();
        nutformsignup = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        jDialogsignup.setTitle("SIGN UP");
        jDialogsignup.setModal(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("SIGN UP FORM");

        jLabel6.setText("UserName");

        jLabel7.setText("PassWord  ");

        jLabel8.setText("Confirm PassWord");

        nutsignup.setText("SIGN UP");
        nutsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsignupActionPerformed(evt);
            }
        });

        nutacancel.setText("CANCEL");
        nutacancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutacancelActionPerformed(evt);
            }
        });

        nhapusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapusernameFocusLost(evt);
            }
        });

        nhappassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhappasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogsignupLayout = new javax.swing.GroupLayout(jDialogsignup.getContentPane());
        jDialogsignup.getContentPane().setLayout(jDialogsignupLayout);
        jDialogsignupLayout.setHorizontalGroup(
            jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogsignupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jDialogsignupLayout.createSequentialGroup()
                            .addComponent(nutsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(nutacancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nhapusername)
                        .addComponent(nhappassword)
                        .addComponent(nhapconfirm)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jDialogsignupLayout.setVerticalGroup(
            jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogsignupLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhappassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jDialogsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutacancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN TO SYSTEM ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 68, 377, 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("UserName  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 84, 100, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PassWord  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 142, 100, 32));

        nhaptendn.setPreferredSize(new java.awt.Dimension(90, 30));
        nhaptendn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhaptendnFocusLost(evt);
            }
        });
        nhaptendn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptendnActionPerformed(evt);
            }
        });
        getContentPane().add(nhaptendn, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 83, 229, -1));

        nhapmatkhau.setPreferredSize(new java.awt.Dimension(90, 30));
        getContentPane().add(nhapmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 144, 229, -1));

        chkRemember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkRemember.setForeground(new java.awt.Color(255, 255, 255));
        chkRemember.setSelected(true);
        chkRemember.setText("Remember Me ??");
        chkRemember.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                chkRememberComponentResized(evt);
            }
        });
        getContentPane().add(chkRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 192, -1, -1));

        nutlogin.setText("LOGIN");
        nutlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutloginActionPerformed(evt);
            }
        });
        getContentPane().add(nutlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 90, 30));

        nutformsignup.setText("SIGN UP");
        nutformsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutformsignupActionPerformed(evt);
            }
        });
        getContentPane().add(nutformsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 90, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 226, 380, 10));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhaptendnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptendnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhaptendnActionPerformed

    private void chkRememberComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_chkRememberComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRememberComponentResized

    private void nutloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutloginActionPerformed
        // TODO add your handling code here:
        String username = nhaptendn.getText();
        String password = new String(nhapmatkhau.getPassword());
        StringBuilder sb = new StringBuilder();
        if (username.equals("")) {
            sb.append("UserName is empty !!\n");
        }
        if (password.equals("")) {
            sb.append("PassWord is empty !!\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            for (TaiKhoanDangNhap tk : listdn) {
                if (username.equals(tk.getTendangnhap()) && password.equals(tk.getMatkhau())) {
                    JOptionPane.showMessageDialog(this, "Login successfully");
                    if (chkRemember.isSelected()) {
                        JOptionPane.showMessageDialog(this, "Login information is remember");
                    }
                    Menu ql = new Menu();
                    this.dispose();
                    this.setVisible(false);
                    ql.setVisible(true);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Failure", JOptionPane.ERROR_MESSAGE);
            nhaptendn.setText("");
            nhapmatkhau.setText("");
        }
    }//GEN-LAST:event_nutloginActionPerformed

    private void nutformsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutformsignupActionPerformed
        // TODO add your handling code here:
        jDialogsignup.setSize(550, 400);
        jDialogsignup.setLocationRelativeTo(null);
        jDialogsignup.setVisible(true);
    }//GEN-LAST:event_nutformsignupActionPerformed

    private void nutsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsignupActionPerformed
        // TODO add your handling code here:
        StringBuilder st = new StringBuilder();
        if (nhapusername.getText().equals("")) {
            st.append("Username is required! \n");
            nhapusername.setBackground(Color.red);
        } else {
            nhapusername.setBackground(Color.white);
        }
        String password = new String(nhappassword.getPassword());
        if (password.equals("")) {
            st.append("Password is required! \n");
            nhappassword.setBackground(Color.red);
        } else {
            nhappassword.setBackground(Color.white);
        }
        String confirm = new String(nhapconfirm.getPassword());
        if (!password.equals(confirm)) {
            st.append("Password and confirm password must be the same \n");
            nhappassword.setBackground(Color.red);
            nhapconfirm.setBackground(Color.red);
        } else {
            nhappassword.setBackground(Color.white);
            nhapconfirm.setBackground(Color.white);
        }
        if (st.length() > 0) {
            JOptionPane.showMessageDialog(jDialogsignup, st.toString(), "Invalidation is valid", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            TaiKhoanDangNhap dk = new TaiKhoanDangNhap(nhapusername.getText(), password);
            fileLogin.WriteFileLogin(dk);
            listdn.add(dk);
            nhapusername.setText("");
            nhappassword.setText("");
            nhapconfirm.setText("");
        }
    }//GEN-LAST:event_nutsignupActionPerformed

    private void nutacancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutacancelActionPerformed
        // TODO add your handling code here:
        jDialogsignup.setVisible(false);
    }//GEN-LAST:event_nutacancelActionPerformed

    private void nhaptendnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhaptendnFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nhaptendnFocusLost

    private void nhapusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapusernameFocusLost
        // TODO add your handling code here:
        if (!nhapusername.getText().isEmpty()) {
            for (TaiKhoanDangNhap tk : listdn) {
                if(nhapusername.getText().equalsIgnoreCase(tk.tendangnhap))
                {
                    nhapusername.setText("");
                    JOptionPane.showMessageDialog(this, "Account already exists!","message",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_nhapusernameFocusLost

    private void nhappasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhappasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhappasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JDialog jDialogsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField nhapconfirm;
    private javax.swing.JPasswordField nhapmatkhau;
    private javax.swing.JPasswordField nhappassword;
    private javax.swing.JTextField nhaptendn;
    private javax.swing.JTextField nhapusername;
    private javax.swing.JButton nutacancel;
    private javax.swing.JButton nutformsignup;
    private javax.swing.JButton nutlogin;
    private javax.swing.JButton nutsignup;
    // End of variables declaration//GEN-END:variables
}