/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Stores;

import Database.mysqlConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author maddukurimonikabhaskar
 */
public class StoresDirectory {
    private ArrayList<Store> StoreDirectory;
    private Store Store;
    private Products products;
    static Connection DbConnection;
    
    
    public static boolean CreateDatainSpecificOrganizationTable(String TableName,int StoreID,String StoreName,String StoreAddress) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql3 = "INSERT INTO " + TableName + "(Store_ID,Store_Name,Store_Address) VALUES(?,?,?);";
        PreparedStatement pst2 = DbConnection.prepareStatement(sql3);
        pst2.setInt(1, StoreID);
        pst2.setString(2,StoreName );
        pst2.setString(3, StoreAddress);
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
    
    public static ResultSet CheckSpecificTableforData(String TableName,int Store_ID) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql4 = "SELECT * FROM " + TableName + " WHERE Store_ID = ?;";
        PreparedStatement pst3 = DbConnection.prepareStatement(sql4);
        pst3.setInt(1, Store_ID);
        return pst3.executeQuery();
        
    }
    
    public static void UpdateDatainSpecificTable(String TableName,int UpdateStoreID, String UpdateStoreName,String UpdateStoreAddress, int OriginalStoreID) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "UPDATE " + TableName + " SET Store_ID = ?, Store_Name = ?, Store_Address = ? WHERE Store_ID = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setInt(1, UpdateStoreID);
        pst.setString(2, UpdateStoreName );
        pst.setString(3,UpdateStoreAddress );
        pst.setInt(4, OriginalStoreID);
        pst.execute();
        
        
    }
    
    public static void DeleteDatafromSpecificTable(String TableName,int StoreID) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "DELETE FROM " + TableName + " WHERE Store_ID = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setInt(1, StoreID);
        pst.execute();
    }
    
    public static ResultSet GetAllDataFromSpecificTable(String TableName) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT * FROM " + TableName + ";";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        return pst.executeQuery();
    }
    
    

    public ArrayList<Store> getStoreDirectory() {
        return StoreDirectory;
    }

    public void setStoreDirectory(ArrayList<Store> StoreDirectory) {
        this.StoreDirectory = StoreDirectory;
    }

    public Store getStore() {
        return Store;
    }

    public void setStore(Store Store) {
        this.Store = Store;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
    
}
