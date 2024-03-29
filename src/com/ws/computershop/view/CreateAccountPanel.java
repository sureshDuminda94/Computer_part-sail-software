/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.view;

import com.ws.computershop.controller.AccountController;
import com.ws.computershop.model.Account;
import com.ws.computershop.other.Validation;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Waruna
 */
public class CreateAccountPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public CreateAccountPanel() {
        initComponents();
    }

    public CreateAccountPanel(LoginForm loginForm) {
        initComponents();
        this.loginForm = loginForm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameCombo = new javax.swing.JComboBox();
        passwordText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        confirmPasswordText = new javax.swing.JPasswordField();
        messageLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Create Account");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("User Name ");

        userNameCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin" }));

        passwordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTextKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        createButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createButton.setText("Create & Log");
        createButton.setEnabled(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Confarm Password");

        confirmPasswordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmPasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmPasswordTextKeyTyped(evt);
            }
        });

        messageLabel.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(userNameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(createButton)
                    .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        if (passwordText.getText().equals(confirmPasswordText.getText())) {
            Account account = new Account(userNameCombo.getSelectedItem().toString(), passwordText.getText());
            try {
                int createAccount = AccountController.createAccount(account);
                if (1 == createAccount) {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("You Have Allredy Account");
                } else if (2 == createAccount) {
                    messageLabel.setText("Account Create Error");
                    System.out.println("2");
                } else if (3 == createAccount) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Account Create sucess");
                    loginForm.closeWindow();
                    new HomeForm().setVisible(true);
                } else if (4 == createAccount) {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Account Create Error");
                    System.out.println("4");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Account Create Error");
                System.out.println("ex");
            }
        } else {
            messageLabel.setText("Password Miss Match");
            confirmPasswordText.setForeground(Color.red);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void passwordTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyTyped
        Validation.enableButton(createButton, passwordText, confirmPasswordText);
    }//GEN-LAST:event_passwordTextKeyTyped

    private void confirmPasswordTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordTextKeyTyped
        Validation.enableButton(createButton, passwordText, confirmPasswordText);
    }//GEN-LAST:event_confirmPasswordTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JButton createButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JComboBox userNameCombo;
    // End of variables declaration//GEN-END:variables
    private LoginForm loginForm;
}
