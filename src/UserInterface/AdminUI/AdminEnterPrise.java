/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.AdminUI;

import Business.ConfigureEcoSystem;
import Business.ConfigureEnterPrise;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monika
 */
public class AdminEnterPrise extends javax.swing.JPanel {

    /**
     * Creates new form AdminEnterPrise
     */
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public AdminEnterPrise() throws SQLException {
        initComponents();
        populateCombobox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxEcoSystem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtEnterPriseName = new javax.swing.JTextField();
        txtEnterPriseID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterPrise = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        cbxEcoSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEcoSystemActionPerformed(evt);
            }
        });

        jLabel1.setText("Select EcoSystem:");

        txtEnterPriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterPriseNameActionPerformed(evt);
            }
        });

        jLabel2.setText("EnterPrise Name");

        jLabel3.setText("EnterPrise ID");

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

        tblEnterPrise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EnterPrise ID", "EnterPrise Name", "EcoSystem"
            }
        ));
        jScrollPane1.setViewportView(tblEnterPrise);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(396, 396, 396)
                                .addComponent(btnRefresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnUpdate)
                                .addGap(101, 101, 101)
                                .addComponent(btnDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEnterPriseID)
                                .addComponent(txtEnterPriseName)
                                .addComponent(cbxEcoSystem, 0, 145, Short.MAX_VALUE)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEcoSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterPriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnterPriseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
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
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEcoSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEcoSystemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEcoSystemActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        try {
            // TODO add your handling code here:
            populateEnterPriseTable();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            // TODO add your handling code here:
            int EnterPrise = Integer.parseInt(txtEnterPriseID.getText());
            String EnterPriseName = txtEnterPriseName.getText();
            String Ecosystem = (String) cbxEcoSystem.getSelectedItem();
            boolean checkData = false;
            for(ConfigureEnterPrise checkEnterPrise:ConfigureEcoSystem.EnterPriseList){
                if(checkEnterPrise.getEnterPriseName().equals(EnterPriseName)){
                    checkData =true;
                    break;
                    
                }
                else{
                    checkData = false;
                }
            }
            System.out.println(checkData);
            if(checkData == false){
                ConfigureEnterPrise createEnterPrise = new ConfigureEnterPrise();
                createEnterPrise.setEnterPriseName(EnterPriseName);
                createEnterPrise.setEnterPriseID(EnterPrise);
                ConfigureEcoSystem.EnterPriseList.add(createEnterPrise);
            }
            int size = ConfigureEcoSystem.EnterPriseList.size();
            
            System.out.println(size);
            
            

            ResultSet rs1 = ConfigureEnterPrise.CheckEnterPriseTableforData(EnterPriseName,Ecosystem);
            if(rs1.next()){
                JOptionPane.showMessageDialog(this, "EnterPrise Already Exists");
            }
            else{
                boolean isCreated = ConfigureEnterPrise.CreateDatainEnterPriseTable(EnterPrise, EnterPriseName,Ecosystem);
                populateEnterPriseTable();
                if(isCreated){
                    JOptionPane.showMessageDialog(this, "EnterPrise Created");
                }
                
                
                
                
                
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

            
        

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblEnterPrise.getSelectedRow();
        int UpdateEnterPriseID = Integer.parseInt(txtEnterPriseID.getText());
        String UpdateEnterPriseName = txtEnterPriseName.getText();
        String UpdateEcosystem = (String) cbxEcoSystem.getSelectedItem();
        if(selectRow>=0){
            int EcoID = (int) tblEnterPrise.getValueAt(selectRow, 0);
            String EnterPriseName = (String) tblEnterPrise.getValueAt(selectRow, 1);
            String Ecosystem = (String) tblEnterPrise.getValueAt(selectRow, 2);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Update?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
               
                try {
                    ResultSet rs1 = ConfigureEnterPrise.CheckEnterPriseTableforData(EnterPriseName,Ecosystem);
                    if(rs1.next()){
                        JOptionPane.showMessageDialog(this, "EnterPrise Already Exists");
                    }
                    else{
                        ConfigureEnterPrise.UpdateDatainEnterPriseTable(UpdateEnterPriseID, UpdateEnterPriseName,UpdateEcosystem,EnterPriseName,Ecosystem);
                    }
                    
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                try {
                    populateEnterPriseTable();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                    txtEnterPriseName.setText("");
                    txtEnterPriseID.setText("");

               

            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row to update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectRow = tblEnterPrise.getSelectedRow();
        if(selectRow>=0){
            String EnterPriseName = (String) tblEnterPrise.getValueAt(selectRow, 1);
            String Ecosystem = (String) tblEnterPrise.getValueAt(selectRow, 2);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                
                try {
                    ConfigureEnterPrise.DeleteDatafromEnterPriseSystemTable(EnterPriseName, Ecosystem);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                try {
                    populateEnterPriseTable();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(AdminEnterPrise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                

            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row to delete");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEnterPriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterPriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterPriseNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxEcoSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEnterPrise;
    private javax.swing.JTextField txtEnterPriseID;
    private javax.swing.JTextField txtEnterPriseName;
    // End of variables declaration//GEN-END:variables

    private void populateCombobox() throws SQLException {
        DefaultComboBoxModel EcosystemCbx = (DefaultComboBoxModel) cbxEcoSystem.getModel();
        EcosystemCbx.removeAllElements();
        ResultSet rs = ConfigureEcoSystem.GetAllEcosystemNames();
        while(rs.next()){
            EcosystemCbx.addElement(rs.getString(1));
            
        }
    }
    
    private void populateEnterPriseTable() throws SQLException{
        DefaultTableModel EnterPriseTable = (DefaultTableModel) tblEnterPrise.getModel();
        ResultSet rs1 = ConfigureEnterPrise.GetAllDataFromEnterPriseSystemTable();
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
