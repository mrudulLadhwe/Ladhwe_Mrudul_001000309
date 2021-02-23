/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg1;

import java.util.Scanner;

/**
 *
 * @author mrudu
 */
public class VitalSigns {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Patient pd = new Patient();
        int ageMonths = 0;
        int ageYears = 0;   
        
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        
        System.out.println("Age less than 1 year? (Y/N)");
        String ch = sc.nextLine();
        if(ch.equals("Y") || ch.equals("y")){
            System.out.println("Enter the age in months: ");
            ageMonths = sc.nextInt();
        }else{
            System.out.println("Enter the age in years: ");
            ageYears = sc.nextInt();
        }
        
        System.out.println("Enter your Respiratory Rate: ");
        int respRate = sc.nextInt();
        
        System.out.println("Enter your Heart Rate: ");
        int heartRate = sc.nextInt();
        
        System.out.println("Enter your Blood Pressure: ");
        int bloodPressure = sc.nextInt();
        
        System.out.println("Enter your Weight in lb: ");
        double weightInPounds = sc.nextDouble();
        
        double weightInKg = weightInPounds * 0.4536;
        
        System.out.println("The patient is normal: "+ pd.isPatientNormal(respRate, heartRate, bloodPressure, ageMonths, ageYears, weightInKg, weightInPounds));
        
        
    }
}
