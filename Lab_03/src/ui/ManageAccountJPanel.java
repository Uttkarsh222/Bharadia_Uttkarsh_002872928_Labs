/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Account;
import model.AccountDirectory;

/**
 *
 * @author uttkarsh
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountJPanel
     */
     private JPanel UserProcessContainer;
    private AccountDirectory accountDirectory;
    

    ManageAccountJPanel(JPanel UserProcessContainer, AccountDirectory accountDirectory) {
    initComponents();
    
        this.UserProcessContainer=UserProcessContainer;
        this.accountDirectory=accountDirectory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblacc = new javax.swing.JTable();
        searchaccount = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        searchacc = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 102));

        tblacc.setBackground(new java.awt.Color(153, 255, 255));
        tblacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ));
        jScrollPane1.setViewportView(tblacc);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnview.setText("View Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        searchacc.setText("Search by Account Number");
        searchacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchaccActionPerformed(evt);
            }
        });

        btnback.setText("<<BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(searchacc)
                        .addGap(18, 18, 18)
                        .addComponent(searchaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnview)))
                .addGap(48, 48, 48))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {searchacc, searchaccount});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchacc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnview))
                .addGap(18, 18, 18)
                .addComponent(btnback)
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {searchacc, searchaccount});

    }// </editor-fold>//GEN-END:initComponents

    private void searchaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchaccActionPerformed
        // TODO add your handling code here:
        Account result = accountDirectory.searchAccount(searchaccount.getText());
            if(result == null){
        JOptionPane.showMessageDialog(null, "Account number you entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            ViewAccountJPanel panel=new ViewAccountJPanel(UserProcessContainer, result);
            UserProcessContainer.add("ViewAccountJPanel",panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        
    }//GEN-LAST:event_searchaccActionPerformed
    }
    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblacc.getSelectedRow();
            if (selectedRow < 0){
                 JOptionPane.showMessageDialog(null, "Please select a row from table first to View Detail!", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnviewActionPerformed
            else{
               Account account = (Account) tblacc.getValueAt(selectedRow, 0);
               ViewAccountJPanel panel= new ViewAccountJPanel(UserProcessContainer, account);
               UserProcessContainer. add ("ViewAccountJPanel", panel);
                CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
                layout.next(UserProcessContainer);
            }
            
            }
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
         UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblacc.getSelectedRow();
            if (selectedRow >= 0){
            int dialogButton = JOptionPane. YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the account details?", "Warning", dialogButton);
            if (dialogResult == JOptionPane. YES_OPTION) {
            Account account = (Account) tblacc.getValueAt(selectedRow, 0);
            accountDirectory.deleteAccount (account) ;
            populateTable() ;
            }
            }
            else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_btndeleteActionPerformed


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchacc;
    private javax.swing.JTextField searchaccount;
    private javax.swing.JTable tblacc;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
      DefaultTableModel dtm = (DefaultTableModel) tblacc.getModel();
        dtm.setRowCount(0);
        for (Account account: accountDirectory.getAccountList()) {
        Object[] row = new Object[4];
        row[0] = account;
        row[1] = account.getRoutingNumber();
        row[2]=  account.getAccountNumber();
        row[3] = account.getBalance();
        dtm.addRow(row);
    }
}
}