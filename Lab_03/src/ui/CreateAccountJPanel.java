/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Account;
import model.AccountDirectory;

/**
 *
 * @author uttkarsh
 */

public class CreateAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccountJPanel
     */
    private JPanel UserProcessContainer;
    private AccountDirectory accountDirectory;
    
    CreateAccountJPanel(JPanel UserProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.UserProcessContainer=UserProcessContainer;
        this.accountDirectory=accountDirectory;
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
        btncreate = new javax.swing.JButton();
        txtRoutingnumber = new javax.swing.JTextField();
        txtaccno = new javax.swing.JTextField();
        txtbnkname = new javax.swing.JTextField();
        txtbal = new javax.swing.JTextField();
        lblrout = new javax.swing.JLabel();
        lblacc = new javax.swing.JLabel();
        lblbnkname = new javax.swing.JLabel();
        lblbal = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE ACCOUNT ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        btncreate.setBackground(new java.awt.Color(204, 255, 204));
        btncreate.setText("Create Account");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        txtaccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccnoActionPerformed(evt);
            }
        });

        lblrout.setBackground(new java.awt.Color(255, 255, 255));
        lblrout.setForeground(new java.awt.Color(255, 255, 255));
        lblrout.setText("Routing Number :");

        lblacc.setBackground(new java.awt.Color(255, 255, 255));
        lblacc.setForeground(new java.awt.Color(255, 255, 255));
        lblacc.setText("Account Number :");

        lblbnkname.setBackground(new java.awt.Color(255, 255, 255));
        lblbnkname.setForeground(new java.awt.Color(255, 255, 255));
        lblbnkname.setText("Bank Name :");

        lblbal.setBackground(new java.awt.Color(255, 255, 255));
        lblbal.setForeground(new java.awt.Color(255, 255, 255));
        lblbal.setText("Balance :");

        btnback.setBackground(new java.awt.Color(204, 255, 255));
        btnback.setText("<< BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblacc)
                    .addComponent(lblbnkname)
                    .addComponent(lblrout)
                    .addComponent(lblbal))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRoutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtbnkname, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtbal, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(txtaccno)))
                .addGap(0, 152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblacc, lblbal, lblbnkname, lblrout, txtRoutingnumber, txtaccno, txtbal, txtbnkname});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblacc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbnkname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbnkname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbal)))
                .addGap(44, 44, 44)
                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnback)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblacc, lblbal, lblbnkname, lblrout, txtRoutingnumber, txtaccno, txtbal, txtbnkname});

    }// </editor-fold>//GEN-END:initComponents

    private void txtaccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccnoActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:

    
    String routingNumber = txtRoutingnumber.getText();
    String accountNumber = txtaccno.getText();
    String bankName = txtbnkname.getText();
    String balanceStr = txtbal.getText();

    // Validate routing number
    if (routingNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Routing number cannot be empty");
        return; // Exit the method to prevent further processing
    }

    // Validate account number
    if (accountNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Account number cannot be empty");
        return;
    }

    // Validate bank name
    if (bankName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Bank name cannot be empty");
        return;
    }

    int balance;
    try {
        balance = Integer.parseInt(balanceStr);
        // Additional validation for balance (e.g., non-negative)
        if (balance < 0) {
            JOptionPane.showMessageDialog(null, "Balance must be a non-negative integer");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Balance must be a valid integer");
        return;
    }

    // All validations passed, create and set the account
    Account account = accountDirectory.addAccount();
    account.setRoutingNumber(routingNumber);
    account.setAccountNumber(accountNumber);
    account.setBankName(bankName);
    account.setBalance(balance);
    
    JOptionPane.showMessageDialog(null, "Account successfully created!");
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblacc;
    private javax.swing.JLabel lblbal;
    private javax.swing.JLabel lblbnkname;
    private javax.swing.JLabel lblrout;
    private javax.swing.JTextField txtRoutingnumber;
    private javax.swing.JTextField txtaccno;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtbnkname;
    // End of variables declaration//GEN-END:variables
}