/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Stores.Products;
import Database.mysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author maddukurimonikabhaskar
 */
public class Order {
    private String orderId;
    private String restaurantName;
    private String CustomerName;
    private String DeliveryMan;
    public static ArrayList<Products> Orderlist = new ArrayList<Products>();
    private String price;
    private String status;
    private String deliveryAddress;
    private ArrayList<ArrayList> TempOrderListArray;
    public static int OrderID = 1;

    public static int getOrderID() {
        return OrderID;
    }

    public static void setOrderID(int OrderID) {
        Order.OrderID = OrderID;
    }

    public ArrayList<ArrayList> getTempOrderListArray() {
        return TempOrderListArray;
    }

    public void setTempOrderListArray(ArrayList<ArrayList> TempOrderListArray) {
        this.TempOrderListArray = TempOrderListArray;
    }

    public static ArrayList<Products> getOrderlist() {
        return Orderlist;
    }

    public static void setOrderlist(ArrayList<Products> Orderlist) {
        Order.Orderlist = Orderlist;
    }

   

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getDeliveryMan() {
        return DeliveryMan;
    }

    public void setDeliveryMan(String DeliveryMan) {
        this.DeliveryMan = DeliveryMan;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
   public static boolean CreateDatainSpecificOrderTable(String CompanyName,int OrderID,String StoreName,String ProductName,String ProductPrice, String OrderStatus, String CustomerEmail,String Location) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql3 = "INSERT INTO "+CompanyName+" (Order_ID,Store_Name,Product_Name,Product_Price,Order_Status,Customer_Email,Customer_Location) VALUES(?,?,?,?,?,?,?);";
        PreparedStatement pst2 = DbConnection.prepareStatement(sql3);
        pst2.setInt(1, OrderID);
        pst2.setString(2,StoreName );
        pst2.setString(3, ProductName);
        pst2.setString(4,ProductPrice );
        pst2.setString(5,OrderStatus);
        pst2.setString(6, CustomerEmail);
        pst2.setString(7, Location);
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
   
   public static ResultSet GetOrderDetails(String CompanyName) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT * FROM "+CompanyName+" ;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        
        
        return pst.executeQuery();
        
    }
   
   public static void UpdateOrderStatusinTable(String Organization,String UpdateOrderStatus,int OrderID) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql = "UPDATE "+Organization+" SET Order_Status = ? WHERE Order_ID = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, UpdateOrderStatus);
        pst.setInt(2, OrderID );
        pst.execute();
        
        
    }
    
}
