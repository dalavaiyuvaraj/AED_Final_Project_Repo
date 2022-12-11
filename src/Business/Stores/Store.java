/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Stores;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author maddukurimonikabhaskar
 */
public class Store {
    private String Name;
    private String StoreID;
    private String Address;
    private String Number;
    private ArrayList<Products> Products;
    private ArrayList<Order> OrderList;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String StoreID) {
        this.StoreID = StoreID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public ArrayList<Products> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Products> Products) {
        this.Products = Products;
    }

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Order> OrderList) {
        this.OrderList = OrderList;
    }
    
}
