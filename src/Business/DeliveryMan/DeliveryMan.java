/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Stores.Products;
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
public class DeliveryMan {
     private String name;
    private String userName;
    private ArrayList<Order> orderList;
    private String address;
    private String number;
    
    
    
    public DeliveryMan(String UserName){
        this.userName=UserName;
        orderList = new ArrayList<Order>();
    }
    
     public void addOrder(String restaurantName, String customerName, String deliverMan, ArrayList<Products> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliverMan);
        order.setPrice(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

     
     
     
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> order) {
        this.orderList = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public static ResultSet GetAllDANames(String Role) throws SQLException{
         Connection DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT Email FROM users WHERE Role = ? ;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, Role);
        
        
        return pst.executeQuery();
        
    }
   
}
