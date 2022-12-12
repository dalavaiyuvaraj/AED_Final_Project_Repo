/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

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
 * @author maddukurimonikabhaskar
 */
public class Customer {
    
    
    private String name;
    private String userName;
    private ArrayList<Order> orderList;
    private String address;
    private String number;
    
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
    
    
    public Customer(String userName){
        this.userName = userName;
        orderList=new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
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
    
    int id = 1;
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Products> Order, String price, String deliveryAddress) {
        Order order=new Order();
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurentName);
        order.setDeliveryMan(deliverMan);
        order.setPrice(price);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    
    public static ResultSet GetOrderDetails(String CompanyName, String CustomerEmail) throws SQLException{
        Connection DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT Order_ID,Store_Name,Product_Name,Product_Price,Order_Status FROM "+CompanyName+" WHERE Customer_Email = ?; ";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, CustomerEmail);
        
        
        return pst.executeQuery();
        
    }
    
    
}
