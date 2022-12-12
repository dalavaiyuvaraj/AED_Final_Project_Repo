/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.AdminUI;

import Business.ConfigureEcoSystem;
import Business.ConfigureEnterPrise;
import Business.ConfigureOrganization;
import Database.mysqlConnection;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author maddukurimonikabhaskar
 */
public class AdminOrganization extends javax.swing.JPanel {

    /**
     * Creates new form AdminOrganization
     */
    Connection connection;
    public AdminOrganization() throws SQLException {
        initComponents();
        populateEcoSystemCombobox();
        populateEnterPriseCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxEcosystem = new javax.swing.JComboBox<>();
        cbxEnterPrise = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrganizationName = new javax.swing.JTextField();
        txtOrganizationID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();

        cbxEcosystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEcosystemActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Ecosystem");

        jLabel2.setText("Select EnterPrise");

        jLabel3.setText("Organization Name");

        jLabel4.setText("Organization ID");

        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Ecosystem");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCreate.setText("Create ");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization ID", "Organization Name", "EcoSystem", "EnterPrise"
            }
        ));
        jScrollPane1.setViewportView(tblOrganization);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnUpdate)
                                .addGap(101, 101, 101)
                                .addComponent(btnDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxEcosystem, 0, 159, Short.MAX_VALUE)
                                    .addComponent(cbxEnterPrise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtOrganizationName)
                                .addComponent(txtOrganizationID, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefresh)
                                .addGap(11, 11, 11)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEcosystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEnterPrise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOrganizationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRefresh))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblOrganization.getSelectedRow();
        int UpdateOrganizationID = Integer.parseInt(txtOrganizationID.getText());
        String UpdateOrganizationName = txtOrganizationName.getText();
        String UpdateOrganizationOrder = UpdateOrganizationName+"_orders"+";";
        String UpdateEcosystem = (String) cbxEcosystem.getSelectedItem();
        String UpdateEnterPrise = (String) cbxEnterPrise.getSelectedItem();
        if(selectRow>=0){
            int EcoID = (int) tblOrganization.getValueAt(selectRow, 0);
            String OrganizationName = (String) tblOrganization.getValueAt(selectRow, 1);
            String OrganizationOrders = OrganizationName+"_orders"+";";
            String EnterPrise = (String) tblOrganization.getValueAt(selectRow, 2);
            String Ecosystem = (String) tblOrganization.getValueAt(selectRow, 3);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Update?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                try {
                    ResultSet rs1 = ConfigureOrganization.CheckOrganizationTableforData(UpdateOrganizationName, UpdateEnterPrise, UpdateEcosystem);
                    if(rs1.next()){
                        JOptionPane.showMessageDialog(this, "Organization Already Exists");
                    }
                    else{
                        ConfigureOrganization.UpdateDatainOrganizationTable(UpdateOrganizationID, UpdateOrganizationName, UpdateEcosystem, UpdateEnterPrise, OrganizationName, Ecosystem, EnterPrise);
                        String sql1 = "ALTER TABLE "+OrganizationName+" RENAME TO "+UpdateOrganizationName+";";
                        String sql2 = "ALTER TABLE "+OrganizationOrders+" RENAME TO "+UpdateOrganizationOrder+";";
                        connection = mysqlConnection.getConnection();
                        PreparedStatement pst = connection.prepareStatement(sql1);
                        PreparedStatement pst2 = connection.prepareStatement(sql2);
                        pst2.execute();
                        pst.execute();
                        JOptionPane.showMessageDialog(this, "Organization Details Updated");
                    }
                    
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                try {
                    populateOrganizationTable();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                txtOrganizationName.setText("");
                txtOrganizationID.setText("");

            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row to update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectRow = tblOrganization.getSelectedRow();
        if(selectRow>=0){
            String OrganizationName = (String) tblOrganization.getValueAt(selectRow, 1);
            String OrganizationOrders = OrganizationName + "_orders";
            String EnterPrise = (String) tblOrganization.getValueAt(selectRow, 2);
            String Ecosystem = (String) tblOrganization.getValueAt(selectRow, 3);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                try {
                    ConfigureOrganization.DeleteDatafromOrganizationSystemTable(OrganizationName, Ecosystem, EnterPrise);
                    String sql = "DROP TABLE "+OrganizationName+";";
                    String sql1 = "DROP TABLE "+OrganizationOrders+";";
                    connection = mysqlConnection.getConnection();
                    PreparedStatement pst = connection.prepareStatement(sql);
                    PreparedStatement pst2 = connection.prepareStatement(sql1);
                    pst.execute();
                    pst2.execute();
                    JOptionPane.showMessageDialog(this, "Organization Deleted");
                    
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                try {
                    populateOrganizationTable();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row to delete");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        try {
            // TODO add your handling code here:
            populateOrganizationTable();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            // TODO add your handling code here:
            int Organization_ID = Integer.parseInt(txtOrganizationID.getText());
            String Organization_Name = txtOrganizationName.getText();
            String Organization_orders = Organization_Name + "_orders";
            String Ecosystem = (String) cbxEcosystem.getSelectedItem();
            String EnterPrise = (String) cbxEnterPrise.getSelectedItem();

            ResultSet rs1 = ConfigureOrganization.CheckOrganizationTableforData(Organization_Name, EnterPrise, Ecosystem);
            if(rs1.next()){
                JOptionPane.showMessageDialog(this, "Organization Already Exists");
            }
            else{
                boolean isCreated = ConfigureOrganization.CreateDatainOrganizationTable(Organization_ID, Organization_Name, Ecosystem, EnterPrise);
                String sql = "CREATE TABLE " + Organization_Name + "(Store_ID INT NOT NULL UNIQUE, Store_Name VARCHAR(45) NOT NULL UNIQUE, Store_Address VARCHAR(45) NOT NULL);";
                String sql1 = "CREATE TABLE "+Organization_orders+"(Order_ID INT NOT NULL UNIQUE,Store_Name VARCHAR(45) NOT NULL,Product_Name VARCHAR(45) NOT NULL,Product_Price INT NOT NULL,Order_Status VARCHAR(45),Customer_Email VARCHAR(45) NOT NULL,Customer_Location VARCHAR(45) NOT NULL);";
                connection = mysqlConnection.getConnection();
                PreparedStatement pst = connection.prepareStatement(sql);
                PreparedStatement pst2 = connection.prepareStatement(sql1);
                pst.execute();
                pst2.execute();
                
                populateOrganizationTable();
                if(isCreated){
                    JOptionPane.showMessageDialog(this, "Organization Created");
                }

            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void cbxEcosystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEcosystemActionPerformed
        try {
            // TODO add your handling code here:
            populateEnterPriseCombobox();
        } catch (SQLException ex) {
            Logger.getLogger(AdminOrganization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxEcosystemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxEcosystem;
    private javax.swing.JComboBox<String> cbxEnterPrise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtOrganizationID;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables

    private void populateEcoSystemCombobox() throws SQLException {
        DefaultComboBoxModel EcosystemCbx = (DefaultComboBoxModel) cbxEcosystem.getModel();
        EcosystemCbx.removeAllElements();
        ResultSet rs = ConfigureEcoSystem.GetAllEcosystemNames();
        while(rs.next()){
            EcosystemCbx.addElement(rs.getString(1));
            
        }
    }

    private void populateEnterPriseCombobox() throws SQLException {
        String Ecosystem = (String) cbxEcosystem.getSelectedItem();
        DefaultComboBoxModel EnterPriseCbx = (DefaultComboBoxModel) cbxEnterPrise.getModel();
        EnterPriseCbx.removeAllElements();
        ResultSet rs = ConfigureEnterPrise.GetAllEnterPrisesNames(Ecosystem);
        while(rs.next()){
            EnterPriseCbx.addElement(rs.getString(1));
            
        }
        
        
    }

    private void populateOrganizationTable() throws SQLException {
        DefaultTableModel EnterPriseTable = (DefaultTableModel) tblOrganization.getModel();
        ResultSet rs1 = ConfigureOrganization.GetAllDataFromOrganizationSystemTable();
        ResultSetMetaData metaData = (ResultSetMetaData) rs1.getMetaData();
        int columnCount = metaData.getColumnCount();
        EnterPriseTable.setRowCount(0);
        
        Object[] row = new Object[columnCount];
        while (rs1.next()){
            //Get object from column with specific index of result set to array of objects
            for (int i = 0; i < columnCount; i++){
                row[i] = rs1.getObject(i+1);
            }
            //Now add row to table model with that array of objects as an argument
            EnterPriseTable.addRow(row);
        }
    }
    
    
    
    
}

