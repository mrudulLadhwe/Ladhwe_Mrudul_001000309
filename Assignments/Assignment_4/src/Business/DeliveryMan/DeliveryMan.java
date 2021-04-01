/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    String name;
    List<Order> orderList;

    public DeliveryMan(String name) {
        this.name = name;
        orderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
    
}
