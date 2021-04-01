/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import Business.Order.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    String restaurentName;
    Employee restaurantManager;
    String address;
    int number = 1231231234;
    Map<String, Double> menuMap;
    List<Order> allOrders;

    public Restaurant(Employee restaurantManager, String restaurentName, String address) {
        this.restaurantManager = restaurantManager;
        this.restaurentName = restaurentName;
        this.address = address;
        menuMap = new HashMap<String, Double>();
        allOrders = new ArrayList<Order>();
        addMenuItems();
    }

    public Employee getRestaurantManager() {
        return restaurantManager;
    }

    public String getRestaurentName() {
        return restaurentName;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, Double> getMenuMap() {
        return menuMap;
    }

    public void setMenuMap(Map<String, Double> menuMap) {
        this.menuMap = menuMap;
    }

    public void addMenuItems(){
        menuMap.put("Burger", 12.00);
    }
    
    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }

    public void setRestaurantManager(Employee restaurantManager) {
        this.restaurantManager = restaurantManager;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
        
}
