/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mrudu
 */
public class Order {
    
    List<OrderItem> orderItemList;
    String status;

    public Order() {
        orderItemList = new ArrayList<OrderItem>();
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
