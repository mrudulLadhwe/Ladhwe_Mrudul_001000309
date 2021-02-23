/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg2;

/**
 *
 * @author mrudu
 */
public class TestClass {
    
    public static void main(String[] args){
        
        Patient pa = new Patient();
        
        pa.setFirstName("Ross");
                    pa.setLastName("Geller");
                    pa.setAgeM(0);
                    pa.setAgeY(47);
                    pa.vital.newVitalSign(18, 65, 115, 159, 72);
                    pa.vital.newVitalSign(17, 70, 115, 159, 72);
                    pa.vital.newVitalSign(20, 90, 115, 159, 72);
                    System.out.println("Display all history>>>>>");
                    pa.displayDetails();
                    System.out.println();
                    System.out.println("Display current record>>>>>");
                    pa.displayCurrentRecord();
                    System.out.println();
                    
                    String str = "ECG";
                    if((str.equalsIgnoreCase("Respiratory Rate")) || (str.equalsIgnoreCase("Heart Rate"))
                        || (str.equalsIgnoreCase("Blood Pressure")) || (str.equalsIgnoreCase("Weight"))){
                        System.out.println("Is vital sign normal :" + 
                                   pa.isThisVitalSignNormal(str, 0, 40, 23));
                    }else{
                        System.out.println("Parameter not found");
                    }
                    
                    String str2= "Heart Rate";
                    if((str2.equalsIgnoreCase("Respiratory Rate")) || (str2.equalsIgnoreCase("Heart Rate"))
                        || (str2.equalsIgnoreCase("Blood Pressure")) || (str2.equalsIgnoreCase("Weight"))){
                        System.out.println("Is vital sign normal :" + 
                                   pa.isThisVitalSignNormal(str2, 0, 11, 80));
                    }else{
                        System.out.println("Parameter not found");
                    }
                    
                    String str3= "Heart Rate";
                    if((str3.equalsIgnoreCase("Respiratory Rate")) || (str3.equalsIgnoreCase("Heart Rate"))
                        || (str3.equalsIgnoreCase("Blood Pressure")) || (str3.equalsIgnoreCase("Weight"))){
                        System.out.println("Is vital sign normal :" + 
                                   pa.isThisVitalSignNormal(str3, 0, 3, 65));
                    }else{
                        System.out.println("Parameter not found");
                    }
                    
                    
    }
    
}
