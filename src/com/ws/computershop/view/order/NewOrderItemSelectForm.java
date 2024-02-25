/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.view.order;

import com.ws.computershop.controller.ItemController;
import com.ws.computershop.model.Item;
import com.ws.computershop.other.Validation;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Waruna
 */
public class NewOrderItemSelectForm extends javax.swing.JPanel {

    /**
     * Creates new form NewOrderItemSelectForm
     */
    public NewOrderItemSelectForm() {
        initComponents();
        defaultTableModel = (DefaultTableModel) itemTable.getModel();
        orderItemList = new ArrayList<>();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemTypeCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        orderQtyText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        itemNameText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Item Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Item Type");

        itemTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brand New", "Used" }));
        itemTypeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemTypeComboItemStateChanged(evt);
            }
        });
        itemTypeCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemTypeComboKeyTyped(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item CODE", "Name", "Description", "Type", "Price", "Qty"
            }
        ));
        jScrollPane1.setViewportView(itemTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Order Qty");

        orderQtyText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderQtyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orderQtyTextKeyTyped(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addButton.setText("Add Cart");
        addButton.setEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        itemNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemNameTextKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("View Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(itemTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(orderQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(itemTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(orderQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemNameTextKeyTyped
        Validation.inputDigitAndCharaters(itemNameText);
        this.setItemListByName(itemNameText.getText());
    }//GEN-LAST:event_itemNameTextKeyTyped

    private void itemTypeComboKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTypeComboKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTypeComboKeyTyped

    private void itemTypeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemTypeComboItemStateChanged
        this.setItemListByType(itemTypeCombo.getSelectedItem().toString());
    }//GEN-LAST:event_itemTypeComboItemStateChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Item item = new Item();
        item.setCode(itemTable.getValueAt(itemTable.getSelectedRow(), 0).toString());
        item.setName(itemTable.getValueAt(itemTable.getSelectedRow(), 1).toString());
        item.setDescription(itemTable.getValueAt(itemTable.getSelectedRow(), 2).toString());
        item.setItemType(itemTable.getValueAt(itemTable.getSelectedRow(), 3).toString());
        item.setPrice(Double.parseDouble(itemTable.getValueAt(itemTable.getSelectedRow(), 4).toString().toString()));
        item.setQty(Integer.parseInt(orderQtyText.getText()));

        if (null != orderItemList) {
            orderItemList.add(item);
            orderQtyText.setText("");
        } else {
            orderItemList = new ArrayList<>();
            orderQtyText.setText("");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NewOrderForm.setOrderItemViewForm(orderItemList);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void orderQtyTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderQtyTextKeyTyped
        Validation.validateNumberInput(orderQtyText);
        if (itemTable.getSelectedRow() > -1 && null != orderQtyText.getText()) {
            addButton.setEnabled(true);
        } else {
            addButton.setEnabled(false);
        }
    }//GEN-LAST:event_orderQtyTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField itemNameText;
    private javax.swing.JTable itemTable;
    private javax.swing.JComboBox itemTypeCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderQtyText;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel defaultTableModel;
    private ArrayList<Item> itemList;
    private ArrayList<Item> orderItemList;

    private void setItemListByType(String type) {
        defaultTableModel.setRowCount(0);
        if (null == itemList) {
            try {
                itemList = ItemController.getItemList();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Item Not Found !");
            }
        }
        for (Item item : itemList) {
            if (type.equals(item.getItemType())) {
                Object data[] = {item.getCode(), item.getName(), item.getDescription(), item.getItemType(), item.getPrice(), item.getQty()};
                defaultTableModel.addRow(data);
            }
        }
    }

    private void setItemListByName(String itemName) {

        defaultTableModel.setRowCount(0);
        if (null == itemList) {
            try {
                itemList = ItemController.getItemList();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Item Not Found !");
            }
        }

        if (itemName.length() > 0) {
            for (Item item : itemList) {
                if (item.getName().substring(0, itemName.length()).equals(itemName)) {
                    Object data[] = {item.getCode(), item.getName(), item.getDescription(), item.getItemType(), item.getPrice(), item.getQty()};
                    defaultTableModel.addRow(data);
                }
            }
        }

    }

    public ArrayList<Item> getItemList() {
        return orderItemList;
    }

}
