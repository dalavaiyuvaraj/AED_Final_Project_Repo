/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Database.mysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    private Customer customer;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer createUserAccount(String username){
        customer = new Customer(username);
        customerDirectory.add(customer);
        return customer;
    }
    
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerDirectory.size();i++){
            if(customerDirectory.get(i).getUserName()==username){
                customerDirectory.remove(i);
            }
        }
    }
    
    
    
    public static ResultSet CheckusersTableforData(String CustomerEmail) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql4 = "SELECT * FROM users WHERE Email = ?;";
        PreparedStatement pst3 = DbConnection.prepareStatement(sql4);
        pst3.setString(1, CustomerEmail);
        return pst3.executeQuery();
        
    }
    
    public static boolean CreateDatainEcosystemTable(String CustomerName,String CustomerEmail,String CustomerPassword) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String Role = "Customer";
        String Organization = null;
        String sql3 = "INSERT INTO users (Name,Email,Password,Role,Organization) VALUES(?,?,?,?,?);";
        PreparedStatement pst2 = DbConnection.prepareStatement(sql3);
        pst2.setString(1, CustomerName);
        pst2.setString(2,CustomerEmail );
        pst2.setString(3, CustomerPassword);
        pst2.setString(4, Role);
        pst2.setString(5, Organization);
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
    public static ResultSet GetAllCustomers() throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT * FROM users WHERE Role = 'Customer'";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        return pst.executeQuery();
    }
    
    public static void UpdateCustinUsersTable(String UpdateCustomerName,String UpdateCustomerEmail,String UpdateCustomerPassword,String OriginalEmail)throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql = "UPDATE users SET Name = ?, Email = ?, Password = ? WHERE Email = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, UpdateCustomerName);
        pst.setString(2, UpdateCustomerEmail);
        pst.setString(3, UpdateCustomerPassword);
        pst.setString(4, OriginalEmail);
        pst.execute();
        
    }
    
    public static void DeleteCustomerFromuserTable(String DeleteEmail) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql = "DELETE FROM users WHERE Email = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, DeleteEmail);
        pst.execute();
    }
}
