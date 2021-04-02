package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.List;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //system admin
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        ua.setName(employee.getName());
        
        //customers
        UserAccount custUA1 = system.getUserAccountDirectory().createUserAccountCustomer("abcd", "abcd1234", "abcd1234", new CustomerRole());
        CustomerDirectory cd = new CustomerDirectory();
        cd.createCustomer(custUA1.getName(), custUA1.getUsername(), custUA1.getPassword(), "park drive");
        system.setCustomerDirectory(cd);
        
        UserAccount custUA2 = system.getUserAccountDirectory().createUserAccountCustomer("wxyz", "wxyz1234", "abcd1234", new CustomerRole());
        cd.createCustomer(custUA2.getName(), custUA2.getUsername(), custUA2.getPassword(), "queensberry");
        
        
        //restaurants
        Employee emp1 = system.getEmployeeDirectory().createEmployee("EMPone");
        UserAccount resManager1 = system.getUserAccountDirectory().createUserAccount("manager1", "manager1", emp1, new AdminRole());
        emp1.setUsername(resManager1.getUsername());
        resManager1.setName(emp1.getName());
        RestaurantDirectory rd = new RestaurantDirectory();
        Restaurant restaurant1 = rd.createNewRestaurant(emp1, "Vaishali", "FC road Pune");
        restaurant1.getMenuMap().put("Dosa", 10.00);
        restaurant1.getMenuMap().put("Idli", 8.00);
        restaurant1.getMenuMap().put("Uttapam", 9.00);
        system.setRestaurantDirectory(rd);
        
        Employee emp2 = system.getEmployeeDirectory().createEmployee("EMPtwo");
        UserAccount resManager2 = system.getUserAccountDirectory().createUserAccount("manager2", "manager2", emp2, new AdminRole());
        emp2.setUsername(resManager2.getUsername());
        resManager2.setName(emp2.getName());
        Restaurant restaurant2 = rd.createNewRestaurant(emp2, "Wadeshwar", "FC road Pune");
        restaurant2.getMenuMap().put("Pav bhaji", 14.00);
        restaurant2.getMenuMap().put("Misal", 10.00);
        
        //deliveryMan
        Employee del1 = system.getEmployeeDirectory().createEmployee("Delone");
        UserAccount delivery1 = system.getUserAccountDirectory().createUserAccount("delivery1", "delivery1", del1, new DeliverManRole());
        delivery1.setName(del1.getName());
        DeliveryManDirectory dmd = new DeliveryManDirectory();
        dmd.createNewDeliveryMan(delivery1.getName());
        system.setDeliveryManDirectory(dmd);
        
        Employee del2 = system.getEmployeeDirectory().createEmployee("Deltwo");
        UserAccount delivery2 = system.getUserAccountDirectory().createUserAccount("delivery2", "delivery2", del2, new DeliverManRole());
        delivery2.setName(del2.getName());
        dmd.createNewDeliveryMan(delivery2.getName());
        
        //order
        OrderDirectory od = new OrderDirectory();
        system.setOrderDirectory(od);
        
        return system;
    }
    
}
