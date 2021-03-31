/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    List<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<Customer>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    public void createCustomer(String name, String username, String password, String address){
        Customer c = new Customer(name, username, password, address);
        customerList.add(c);
    }
    
}
