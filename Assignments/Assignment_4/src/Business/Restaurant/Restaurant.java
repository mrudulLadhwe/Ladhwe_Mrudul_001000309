/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    String restaurentName;
    Employee restaurantManager;
    String address;
    List<String> menu;

    public Restaurant(Employee restaurantManager, String restaurentName, String address) {
        this.restaurantManager = restaurantManager;
        this.restaurentName = restaurentName;
        this.address = address;
        menu = new ArrayList<String>();
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

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
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
