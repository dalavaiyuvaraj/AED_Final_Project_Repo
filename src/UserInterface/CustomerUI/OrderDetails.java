/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CustomerUI;

import Business.Customer.Customer;
import Business.Stores.Products;
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
public class OrderDetails extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetails
     */
    String CustomerEmail;
    public OrderDetails() {
        initComponents();
    }
    public OrderDetails(String CustomerEmail) {
        initComponents();
        lblCustomerEmail.setText(CustomerEmail);
        this.CustomerEmail = CustomerEmail;
            
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
        lblCustomerEmail = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdersList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbxSelectCompany = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();

        jLabel1.setText("Welcome,");

        btnFind.setText("Find Your Orders");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblOrdersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Store Name", "Product Name", "Product Price", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(tblOrdersList);

        jLabel2.setText("Select Company:");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(535, 535, 535))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnFind)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxSelectCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRefresh))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerEmail)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCustomerEmail))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxSelectCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        
        
        try {
            PopulateOrdersList();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            // TODO add your handling code here:
            PopulateOrganizations();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cbxSelectCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerEmail;
    private javax.swing.JTable tblOrdersList;
    // End of variables declaration//GEN-END:variables
 private void PopulateOrganizations() throws SQLException {
        DefaultComboBoxModel CompanySelect = (DefaultComboBoxModel) cbxSelectCompany.getModel();
        CompanySelect.removeAllElements();
        String Sql = "SELECT Organization_Name FROM organizations;";
        Connection connection = mysqlConnection.getConnection();
        PreparedStatement pst = connection.prepareStatement(Sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            CompanySelect.addElement(rs.getString(1));
            
        }
    }
 private void PopulateOrdersList() throws SQLException {
        DefaultTableModel ProductsTable = (DefaultTableModel) tblOrdersList.getModel();
        String CompanyName = (String) cbxSelectCompany.getSelectedItem();
        CompanyName = CompanyName+"_orders";
        if(CompanyName == null){
            JOptionPane.showMessageDialog(this, "Please Select Store");
        }
        else{
            ResultSet rs1 = Customer.GetOrderDetails(CompanyName, CustomerEmail);
            
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
 
 

}
