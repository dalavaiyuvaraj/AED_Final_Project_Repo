/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Stores;

import static Business.Stores.StoresDirectory.DbConnection;
import Database.mysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author maddukurimonikabhaskar
 */
public class Products {
    private String Name;
    private String Description;
    private String Category;
    private String Price;
    private int Stock;
    private String ProductID;

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    public static ResultSet GetAllDataFromProductsTable(String SelectedStore) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        if("All_Stores".equals(SelectedStore)){
            String sql = "SELECT * FROM products;";
            PreparedStatement pst = DbConnection.prepareStatement(sql);
            System.out.println(sql);
            return pst.executeQuery();
        }
        else{
            String sql = "SELECT * FROM products WHERE Store_Name = ?;";
            PreparedStatement pst = DbConnection.prepareStatement(sql);
            pst.setString(1, SelectedStore);
            System.out.println(sql);
            return pst.executeQuery();
        }
        
    }
    
    public static ResultSet GetAllDataFromProductsTable(String SelectedStore,String SelectedCategory) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String All_Cat = "All_Categories";
        if(SelectedCategory == All_Cat){
            String sql = "SELECT Product_ID,Product_Name,Product_Category,Product_Price FROM products WHERE Store_Name = ?;";
            PreparedStatement pst = DbConnection.prepareStatement(sql);
            pst.setString(1, SelectedStore);
            System.out.println(sql);
            return pst.executeQuery();
        }
        else{
            String sql = "SELECT Product_ID,Product_Name,Product_Category,Product_Price FROM products WHERE Store_Name = ? AND Product_Category = ?;";
            PreparedStatement pst = DbConnection.prepareStatement(sql);
            pst.setString(1, SelectedStore);
            pst.setString(2, SelectedCategory);
            System.out.println(sql);
            return pst.executeQuery();
        }
        
        
        
    }
    
    public static ResultSet GetAllStoreNames(String Organization) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        System.out.println(Organization);
        String sql = "SELECT Store_Name FROM "+Organization+" ;";
        System.out.println(sql);
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        
        
        return pst.executeQuery();
        
    }
    
    public static ResultSet CheckProductsTableforData(int ProductID) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql4 = "SELECT * FROM products WHERE Product_ID = ?;";
        PreparedStatement pst3 = DbConnection.prepareStatement(sql4);
        pst3.setInt(1, ProductID);
        return pst3.executeQuery();
        
    }
    
    public static boolean CreateDatainProductsTable(int ProductID,String ProductName,String ProductCategory, String ProductPrice,String StoreName) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql3 = "INSERT INTO products (Product_ID,Product_Name,Product_Category,Product_Price,Store_Name) VALUES(?,?,?,?,?);";
        PreparedStatement pst2 = DbConnection.prepareStatement(sql3);
        pst2.setInt(1, ProductID);
        pst2.setString(2,ProductName );
        pst2.setString(3, ProductCategory);
        pst2.setString(4, ProductPrice);
        pst2.setString(5, StoreName);
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
    
    public static void UpdateDatainProducstTable(int UpdateProductID, String UpdateProductName,String UpdateProductCategory,String UpdateProductPrice, String UpdateStoreName, int OriginalProductID) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "UPDATE products SET Product_ID = ?, Product_Name = ?, Product_Category = ?,Product_Price = ?,Store_Name = ? WHERE Product_ID = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setInt(1, UpdateProductID);
        pst.setString(2, UpdateProductName );
        pst.setString(3,UpdateProductCategory );
        pst.setString(4, UpdateProductPrice);
        pst.setString(5, UpdateStoreName);
        pst.setInt(6, OriginalProductID);
        pst.execute();
        
        
    }
    
    public static void DeleteDatafromProductsTable(int ProductID) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "DELETE FROM products WHERE Product_ID = ? ;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setInt(1, ProductID);
        pst.execute();
    }
    
}
