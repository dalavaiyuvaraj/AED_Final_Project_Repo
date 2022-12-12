/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DeliveryAgent;

import Business.Customer.Customer;
import Database.mysqlConnection;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class FindDAorders extends javax.swing.JPanel {

    /**
     * Creates new form FindDAorders
     */
    String DAEmail;
    public FindDAorders() {
        initComponents();
    }
    public FindDAorders(String DAEmail) {
        initComponents();
        this.DAEmail = DAEmail;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssignedOrders = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssignedOrders = new javax.swing.JTable();
        lblDAEmail = new javax.swing.JLabel();

        btnAssignedOrders.setText("Assigned Orders");
        btnAssignedOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignedOrdersActionPerformed(evt);
            }
        });

        tblAssignedOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Order ID", "Location"
            }
        ));
        jScrollPane1.setViewportView(tblAssignedOrders);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDAEmail)
                            .addComponent(btnAssignedOrders))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDAEmail)
                .addGap(41, 41, 41)
                .addComponent(btnAssignedOrders)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignedOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignedOrdersActionPerformed
        try {
            // TODO add your handling code here:
            populateAssignOrders();
        } catch (SQLException ex) {
            Logger.getLogger(FindDAorders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAssignedOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignedOrders;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDAEmail;
    private javax.swing.JTable tblAssignedOrders;
    // End of variables declaration//GEN-END:variables

    private void populateAssignOrders() throws SQLException {
        DefaultTableModel ProductsTable = (DefaultTableModel) tblAssignedOrders.getModel();
        String Sql = "Select Order_ID,Customer_Location FROM deliveryagentorders WHERE DA_Email = ?";
        Connection DbConnection = mysqlConnection.getConnection();
        PreparedStatement pst = DbConnection.prepareStatement(Sql);
        pst.setString(1, DAEmail);
        ResultSet rs1 = pst.executeQuery();

            
            ResultSetMetaData metaData = (ResultSetMetaData) rs1.getMetaData();
            int columnCount = metaData.getColumnCount();
            ProductsTable.setRowCount(0);
        
            Object[] row = new Object[columnCount];
            while (rs1.next()){
                //Get object from column with specific index of result set to array of objects
                for (int i = 0; i < columnCount; i++){
                    row[i] = rs1.getObject(i+1);
                }
                //Now add row to table model with that array of objects as an argument
                ProductsTable.addRow(row);
            }
            
            
            }
}
