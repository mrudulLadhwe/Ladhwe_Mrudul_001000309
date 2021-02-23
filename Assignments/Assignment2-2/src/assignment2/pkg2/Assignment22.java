/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg2;

import java.util.Scanner;

/**
 *
 * @author mrudu
 */
public class Assignment22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patient p = new Patient();
        Patient pa = new Patient();
        Scanner sc = new Scanner(System.in);
        char con;
        int choice;
        
        do{
            
            System.out.println("1. Input the patient data.");
            System.out.println("2. Display the patient data.");
            System.out.println("3. Display the patient current record.");
            System.out.println("4. Check if vital sign value is normal.");
            System.out.println("5. Display test cases");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            String firstName;
            String lastName;
            int ageMo =0;
            int ageYrs =0;
            int rRate;
            int hRate;
            int bp;
            double weightinLbs;
            double weightInKgs;
            String vitalSign = "";
            int val =0;
            
            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter your first name: ");
                    firstName = sc.nextLine();
                    p.setFirstName(firstName);
                    
                    System.out.println("Enter your last name: ");
                    lastName = sc.nextLine();
                    p.setLastName(lastName);
                    
                    System.out.println("Age less than 1 year? (Y/N)");
                    String ch = sc.nextLine();
                    if(ch.equals("Y") || ch.equals("y")){
                        System.out.println("Enter the age in months: ");
                        ageMo = sc.nextInt();
                        p.setAgeM(ageMo);
                    }else{
                        System.out.println("Enter the age in years: ");
                        ageYrs = sc.nextInt();
                        p.setAgeY(ageYrs);
                    }
                    
                    System.out.println("Enter your Respiratory Rate: ");
                    rRate = sc.nextInt();

                    System.out.println("Enter your Heart Rate: ");
                    hRate = sc.nextInt();

                    System.out.println("Enter your Blood Pressure: ");
                    bp = sc.nextInt();

                    System.out.println("Enter your Weight in lb: ");
                    weightinLbs = sc.nextDouble();

                    weightInKgs = weightinLbs * 0.4536;
                    
                    p.vital.newVitalSign(rRate, hRate, bp, weightinLbs, weightInKgs);
                    break;
                    
                case 2:
                    if(p.getFirstName() == null){
                        System.out.println("Patient not found");
                    }else{
                        System.out.println("Patient Full History");
                        p.displayDetails();
                    }
                    break;
                case 3:
                    if(p.getFirstName() == null){
                        System.out.println("Patient not found");
                    }else{
                        System.out.println("Patient Current Record");
                        p.displayCurrentRecord();   
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter the vital sign you want to check: ");
                    vitalSign = sc.nextLine();
                    if((vitalSign.equalsIgnoreCase("Respiratory Rate")) || (vitalSign.equalsIgnoreCase("Heart Rate"))
                        || (vitalSign.equalsIgnoreCase("Blood Pressure")) || (vitalSign.equalsIgnoreCase("Weight"))){
                        System.out.println("Age less than 1 year? (Y/N)");
                        String ch1 = sc.nextLine();
                        if(ch1.equals("Y") || ch1.equals("y")){
                            System.out.println("Enter the age in months: ");
                            ageMo = sc.nextInt();
                        }else{
                            System.out.println("Enter the age in years: ");
                            ageYrs = sc.nextInt();
                        }
                        System.out.println("Enter rate: ");
                        val = sc.nextInt();
                        System.out.println("Is vital sign normal :" + 
                                   p.isThisVitalSignNormal(vitalSign, ageMo, ageYrs, val));
                    }else{
                        System.out.println("Parameter not found");
                    }
                    break;
                case 5:
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
                    
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
            
            System.out.print("Do you wish to continue (Y/N): ");
            con = sc.next().charAt(0);
            
        }while ((con == 'y') || (con == 'Y'));
    
    
    }
    
}
