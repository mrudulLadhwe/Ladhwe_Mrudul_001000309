package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
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
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        UserAccount custUA1 = system.getUserAccountDirectory().createUserAccountCustomer("abc", "abc", "abc", new CustomerRole());
        CustomerDirectory cd = new CustomerDirectory();
        cd.createCustomer(custUA1.getName(), custUA1.getUsername(), custUA1.getPassword());
        system.setCustomerDirectory(cd);
        
        return system;
    }
    
}
