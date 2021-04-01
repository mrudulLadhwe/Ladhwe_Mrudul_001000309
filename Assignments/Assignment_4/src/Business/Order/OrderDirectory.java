/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrudu
 */
public class OrderDirectory {
    
    List<Order> allOrders;

    public OrderDirectory() {
        allOrders = new ArrayList<Order>();
    }

    public List<Order> getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(List<Order> allOrders) {
        this.allOrders = allOrders;
    }
    
    
    
}
