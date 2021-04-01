package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
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
        UserAccount custUA1 = system.getUserAccountDirectory().createUserAccountCustomer("abc", "abc", "abc", new CustomerRole());
        CustomerDirectory cd = new CustomerDirectory();
        cd.createCustomer(custUA1.getName(), custUA1.getUsername(), custUA1.getPassword(), "park drive");
        system.setCustomerDirectory(cd);
        
        UserAccount custUA2 = system.getUserAccountDirectory().createUserAccountCustomer("xyz", "xyz", "xyz", new CustomerRole());
        cd.createCustomer(custUA2.getName(), custUA2.getUsername(), custUA2.getPassword(), "queensberry");
        
        
        //restaurants
        Employee emp1 = system.getEmployeeDirectory().createEmployee("EMP1");
        UserAccount resManager1 = system.getUserAccountDirectory().createUserAccount("manager1", "manager1", emp1, new AdminRole());
        emp1.setUsername(resManager1.getUsername());
        resManager1.setName(emp1.getName());
        RestaurantDirectory rd = new RestaurantDirectory();
        rd.createNewRestaurant(emp1, "Vaishali", "FC road Pune");
        system.setRestaurantDirectory(rd);
        
        Employee emp2 = system.getEmployeeDirectory().createEmployee("EMP2");
        UserAccount resManager2 = system.getUserAccountDirectory().createUserAccount("manager2", "manager2", emp2, new AdminRole());
        emp2.setUsername(resManager2.getUsername());
        resManager2.setName(emp2.getName());
        rd.createNewRestaurant(emp2, "Wadeshwar", "FC road Pune");
        
        
        //deliveryMan
        Employee del1 = system.getEmployeeDirectory().createEmployee("Del1");
        UserAccount delivery1 = system.getUserAccountDirectory().createUserAccount("dman1", "dman1", del1, new DeliverManRole());
        delivery1.setName(del1.getName());
        DeliveryManDirectory dmd = new DeliveryManDirectory();
        dmd.createNewDeliveryMan(delivery1.getName());
        system.setDeliveryManDirectory(dmd);
        
        Employee del2 = system.getEmployeeDirectory().createEmployee("Del2");
        UserAccount delivery2 = system.getUserAccountDirectory().createUserAccount("dman2", "dman2", del2, new DeliverManRole());
        delivery2.setName(del2.getName());
        dmd.createNewDeliveryMan(delivery2.getName());
        
        return system;
    }
    
}
