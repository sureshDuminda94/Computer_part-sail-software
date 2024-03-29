/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.view;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Waruna
 */
public class ImageForm extends javax.swing.JPanel {

    /**
     * Creates new form NewCustomerForm
     */
    public ImageForm() {
        initComponents();
        this.animateLables();
        this.setDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        animatePanel = new javax.swing.JPanel();
        itemLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        animateLabel6 = new javax.swing.JLabel();
        animateLabel1 = new javax.swing.JLabel();
        animateLabel2 = new javax.swing.JLabel();
        animateLabel3 = new javax.swing.JLabel();
        animateLabel4 = new javax.swing.JLabel();
        animateLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        mainPanel.setBackground(new java.awt.Color(0, 153, 255));

        animatePanel.setBackground(new java.awt.Color(0, 153, 255));
        animatePanel.setLayout(null);

        itemLabel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        itemLabel.setForeground(new java.awt.Color(255, 255, 255));
        itemLabel.setText("Over Items");
        animatePanel.add(itemLabel);
        itemLabel.setBounds(20, 20, 170, 33);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        dateLabel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        animatePanel.add(jPanel1);
        jPanel1.setBounds(530, 10, 360, 50);

        animateLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        animateLabel6.setForeground(new java.awt.Color(255, 255, 255));
        animateLabel6.setText("Ups System");
        animatePanel.add(animateLabel6);
        animateLabel6.setBounds(20, 410, 170, 20);

        animateLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        animateLabel1.setForeground(new java.awt.Color(255, 255, 255));
        animateLabel1.setText("Desktop Computers");
        animatePanel.add(animateLabel1);
        animateLabel1.setBounds(20, 110, 170, 20);

        animateLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        animateLabel2.setForeground(new java.awt.Color(255, 255, 255));
        animateLabel2.setText("LapTop Computers");
        animatePanel.add(animateLabel2);
        animateLabel2.setBounds(20, 170, 170, 20);

        animateLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        animateLabel3.setForeground(new java.awt.Color(255, 255, 255));
        animateLabel3.setText("MotherBord Items");
        animatePanel.add(animateLabel3);
        animateLabel3.setBounds(20, 230, 170, 20);

        animateLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        animateLabel4.setForeground(new java.awt.Color(255, 255, 255));
        animateLabel4.setText("Ram Cards");
        animatePanel.add(animateLabel4);
        animateLabel4.setBounds(20, 290, 170, 20);

        animateLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        animateLabel5.setForeground(new java.awt.Color(255, 255, 255));
        animateLabel5.setText("Power Suplly");
        animatePanel.add(animateLabel5);
        animateLabel5.setBounds(20, 350, 170, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ws/computershop/icon/computer-laptop-2.png"))); // NOI18N
        animatePanel.add(jLabel7);
        jLabel7.setBounds(720, 90, 128, 116);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ws/computershop/icon/network-router-wireless.png"))); // NOI18N
        animatePanel.add(jLabel8);
        jLabel8.setBounds(730, 310, 128, 140);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ws/computershop/icon/audio-headset.png"))); // NOI18N
        animatePanel.add(jLabel9);
        jLabel9.setBounds(540, 80, 128, 120);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ws/computershop/icon/computer-4.png"))); // NOI18N
        animatePanel.add(jLabel10);
        jLabel10.setBounds(340, 90, 128, 116);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ws/computershop/icon/scanner.png"))); // NOI18N
        animatePanel.add(jLabel11);
        jLabel11.setBounds(550, 320, 128, 140);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ws/computershop/icon/printer.png"))); // NOI18N
        animatePanel.add(jLabel14);
        jLabel14.setBounds(350, 330, 128, 140);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("System Develop by ws");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(animatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animateLabel1;
    private javax.swing.JLabel animateLabel2;
    private javax.swing.JLabel animateLabel3;
    private javax.swing.JLabel animateLabel4;
    private javax.swing.JLabel animateLabel5;
    private javax.swing.JLabel animateLabel6;
    private javax.swing.JPanel animatePanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    
    private void setDate() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY,MM,dd");
        String format = dateFormat.format(new java.util.Date());
        dateLabel.setText("Today ".concat(format));
        

    }
    private void animateLables() {
        new Thread() {
            public void run() {
                for (int i = 0; i < 120; i++) {
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    itemLabel.setLocation(i,20);
                }
            }
        }.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 70; i++) {
                    try {
                        Thread.sleep(4);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    animateLabel1.setLocation(i,110);
                }
            }
        }.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 70; i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    animateLabel2.setLocation(i,170);
                }
            }
        }.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 70; i++) {
                    try {
                        Thread.sleep(6);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    animateLabel3.setLocation(i,230);
                }
            }
        }.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 70; i++) {
                    try {
                        Thread.sleep(7);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    animateLabel4.setLocation(i,290);
                }
            }
        }.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 70; i++) {
                    try {
                        Thread.sleep(8);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    animateLabel5.setLocation(i,350);
                }
            }
        }.start();
        new Thread() {
            public void run() {
                for (int i = 0; i < 70; i++) {
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    animateLabel6.setLocation(i,410);
                }
            }
        }.start();
    }
}
