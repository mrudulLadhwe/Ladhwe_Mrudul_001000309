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
public class RestaurantDirectory {
    
    List<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<Restaurant>();
    }
    
    public void createNewRestaurant(Employee restaurantManager, String restaurentName, String address){
        Restaurant res = new Restaurant(restaurantManager, restaurentName, address);
        restaurantList.add(res);
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant searchRestaurant(String name){
        for(int i = 0; i < restaurantList.size(); i++){
            if(restaurantList.get(i).getRestaurentName().equals(name)){
                return restaurantList.get(i);
            }
        }
        
        return null;
    }
    
}
