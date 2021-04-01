/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer {
    
    String name;
    String username;
    String password;
    int totalOrders = 0;
    Order currentOrder;
    String address;
    List<Order> allOrders;

    public Customer(String name, String username, String password, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        allOrders = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public Order newOrder(){
        Order o = new Order();
        currentOrder = o;
        totalOrders++;
        allOrders.add(o);
        return o;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(List<Order> allOrders) {
        this.allOrders = allOrders;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }
    
}
