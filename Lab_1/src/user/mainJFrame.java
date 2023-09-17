/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import model.product;

/**
 *
 * @author admin
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    product product;
    
    public mainJFrame() {
        initComponents();
        
        product = new product();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Splitpane = new javax.swing.JSplitPane();
        Controlpanel = new javax.swing.JPanel();
        btncreate = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        Workarea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlpanelLayout = new javax.swing.GroupLayout(Controlpanel);
        Controlpanel.setLayout(ControlpanelLayout);
        ControlpanelLayout.setHorizontalGroup(
            ControlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnview)
                    .addComponent(btncreate))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        ControlpanelLayout.setVerticalGroup(
            ControlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlpanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btncreate)
                .addGap(18, 18, 18)
                .addComponent(btnview)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        Splitpane.setLeftComponent(Controlpanel);

        javax.swing.GroupLayout WorkareaLayout = new javax.swing.GroupLayout(Workarea);
        Workarea.setLayout(WorkareaLayout);
        WorkareaLayout.setHorizontalGroup(
            WorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        WorkareaLayout.setVerticalGroup(
            WorkareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Splitpane.setRightComponent(Workarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Splitpane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Splitpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed

        // TODO add your handling code here:
        Createjpanel createpanel = new Createjpanel(product);
        Splitpane.setRightComponent(createpanel);
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        ViewJPanel viewPanel = new ViewJPanel(product);
        Splitpane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnviewActionPerformed

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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Controlpanel;
    private javax.swing.JSplitPane Splitpane;
    private javax.swing.JPanel Workarea;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnview;
    // End of variables declaration//GEN-END:variables
}