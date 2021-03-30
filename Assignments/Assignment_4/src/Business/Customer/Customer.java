/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */
public class Customer {
    
    String name;
    String username;
    String password;

    public Customer(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
