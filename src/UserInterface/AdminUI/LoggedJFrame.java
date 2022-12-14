/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.AdminUI;

import Database.mysqlConnection;
import UserInterface.MainJFrame;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author monika
 */
public class LoggedJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoggedJFrame
     */
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public LoggedJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageCust = new javax.swing.JButton();
        btnManageStores = new javax.swing.JButton();
        btnManageDeliveryAgents = new javax.swing.JButton();
        btnCreateEcoSystem = new javax.swing.JButton();
        btnEnterprise = new javax.swing.JButton();
        btnOrganization = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        btnManageCust.setText("Manage Customers");
        btnManageCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustActionPerformed(evt);
            }
        });

        btnManageStores.setText("Manage Store Admins");
        btnManageStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStoresActionPerformed(evt);
            }
        });

        btnManageDeliveryAgents.setText("Manage Delivery Agents");
        btnManageDeliveryAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryAgentsActionPerformed(evt);
            }
        });

        btnCreateEcoSystem.setText("Manage EcoSystems");
        btnCreateEcoSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEcoSystemActionPerformed(evt);
            }
        });

        btnEnterprise.setText("Manage EnterPrise");
        btnEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseActionPerformed(evt);
            }
        });

        btnOrganization.setText("Manage Organization");
        btnOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizationActionPerformed(evt);
            }
        });

        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnManageDeliveryAgents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageStores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateEcoSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLogout))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnCreateEcoSystem)
                .addGap(18, 18, 18)
                .addComponent(btnEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnOrganization)
                .addGap(43, 43, 43)
                .addComponent(btnManageCust)
                .addGap(18, 18, 18)
                .addComponent(btnManageStores)
                .addGap(18, 18, 18)
                .addComponent(btnManageDeliveryAgents)
                .addGap(57, 57, 57)
                .addComponent(btnLogout)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1075, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustActionPerformed
        // TODO add your handling code here:
        ManageCustomers CustomerCreate = new ManageCustomers();
        jSplitPane1.setRightComponent(CustomerCreate);
    }//GEN-LAST:event_btnManageCustActionPerformed

    private void btnCreateEcoSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEcoSystemActionPerformed
        // TODO add your handling code here:
        
        SystemAdminManageEcosystem EcosystemAdmin = new SystemAdminManageEcosystem();
        jSplitPane1.setRightComponent(EcosystemAdmin);

    }//GEN-LAST:event_btnCreateEcoSystemActionPerformed

    private void btnOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizationActionPerformed
        AdminOrganization AdminOrganization = null;
        try {
            // TODO add your handling code here:
            AdminOrganization = new AdminOrganization();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        jSplitPane1.setRightComponent(AdminOrganization);
    }//GEN-LAST:event_btnOrganizationActionPerformed

    private void btnEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseActionPerformed
        // TODO add your handling code here:
        AdminEnterPrise AdminEnterPrise = null;
        try {
            AdminEnterPrise = new AdminEnterPrise();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        jSplitPane1.setRightComponent(AdminEnterPrise);
        
    }//GEN-LAST:event_btnEnterpriseActionPerformed

    private void btnManageStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStoresActionPerformed
        ManageStoreAdmins StoreAdmin = null;
        try {
            // TODO add your handling code here:
            StoreAdmin = new ManageStoreAdmins();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        jSplitPane1.setRightComponent(StoreAdmin);
    }//GEN-LAST:event_btnManageStoresActionPerformed

    private void btnManageDeliveryAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryAgentsActionPerformed
        // TODO add your handling code here:
        ManageDeliveryAgents MDA = new ManageDeliveryAgents();
        jSplitPane1.setRightComponent(MDA);
    }//GEN-LAST:event_btnManageDeliveryAgentsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainJFrame Logout = new MainJFrame();
        Logout.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggedJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggedJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEcoSystem;
    private javax.swing.JButton btnEnterprise;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCust;
    private javax.swing.JButton btnManageDeliveryAgents;
    private javax.swing.JButton btnManageStores;
    private javax.swing.JButton btnOrganization;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
