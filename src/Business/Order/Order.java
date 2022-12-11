/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Stores.Products;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Order {
    private String orderId;
    private String restaurantName;
    private String CustomerName;
    private String DeliveryMan;
    private ArrayList<Products> Order;
    private String price;
    private String status;
    private String deliveryAddress;

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

    public ArrayList<Products> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Products> Order) {
        this.Order = Order;
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
    
}
