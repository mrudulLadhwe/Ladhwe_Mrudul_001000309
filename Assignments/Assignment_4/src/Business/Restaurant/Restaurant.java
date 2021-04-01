/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
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
    Map<String, Double> menuMap;

    public Restaurant(Employee restaurantManager, String restaurentName, String address) {
        this.restaurantManager = restaurantManager;
        this.restaurentName = restaurentName;
        this.address = address;
        menuMap = new HashMap<String, Double>();
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
    
    
    
}
