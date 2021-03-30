/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    String restaurentName;
    Employee restaurantManager;
    String address;

    public Restaurant(Employee restaurantManager, String restaurentName, String address) {
        this.restaurantManager = restaurantManager;
        this.restaurentName = restaurentName;
        this.address = address;
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
    
}
