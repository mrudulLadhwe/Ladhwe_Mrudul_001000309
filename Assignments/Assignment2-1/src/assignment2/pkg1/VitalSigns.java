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
    
    public static void testcaseTrueNewborn(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(35, 130, 55, 0, 0, 2.5, 5.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseFalseNewborn(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(35, 100, 55, 0, 0, 2.5, 5.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseTrueInfant(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(25, 120, 75, 2, 0, 4.5, 10.0);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseFalseInfant(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(35, 150, 75, 2, 0, 4.5, 10.0);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseTrueToddler(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(25, 110, 85, 0, 2, 12, 26.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseFalseToddler(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(35, 150, 75, 0, 2, 12, 26.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseTruePreschooler(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(25, 115, 90, 0, 5, 16, 35.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseFalsePreschooler(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(35, 150, 75, 0, 5, 16, 35.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseTrueSchoolAge(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(25, 90, 85, 0, 8, 21, 46.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseFalseSchoolAge(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(35, 60, 75, 0, 8, 21, 46.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseTrueAdolescent(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(15, 100, 110, 0, 16, 55, 121.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void testcaseFalseAdolescent(){
        Patient p = new Patient();
        boolean ans = p.isPatientNormal(15, 120, 75, 0, 16, 55, 121.5);
        System.out.println("Is patient Normal: "+ans);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Patient pd = new Patient();
        int ageMonths = 0;
        int ageYears = 0;
        
        testcaseTrueNewborn();
        testcaseFalseNewborn();
        testcaseTrueInfant();
        testcaseFalseInfant();
        testcaseTrueToddler();
        testcaseFalseToddler();
        testcaseTruePreschooler();
        testcaseFalsePreschooler();
        testcaseTrueSchoolAge();
        testcaseFalseSchoolAge();
        testcaseTrueAdolescent();
        testcaseFalseAdolescent();
        
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
