/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Restaurant;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mrudu
 */
public class Order {
    
    Restaurant restaurant;
    Map<String, Double> orderMap;

    public Order(Restaurant restaurant) {
        this.restaurant = restaurant;
        orderMap = new HashMap<String, Double>();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Map<String, Double> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<String, Double> orderMap) {
        this.orderMap = orderMap;
    }
    
    
    
}
