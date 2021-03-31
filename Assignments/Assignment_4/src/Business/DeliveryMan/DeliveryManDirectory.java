/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    List<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList<DeliveryMan>();
    }
    
    public void createNewDeliveryMan(String name){
        DeliveryMan d = new DeliveryMan(name);
        deliveryManList.add(d);
    }

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    
    
}
