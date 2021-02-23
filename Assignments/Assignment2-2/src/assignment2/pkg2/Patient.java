/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg2;

import java.util.ArrayList;

/**
 *
 * @author mrudu
 */
public class Patient {
    
    private String firstName;
    private String lastName;
    private int ageM = 0;
    private int ageY = 0;
    VitalSigns vital = new VitalSigns();
    
    public void displayDetails(){
        System.out.println("Patient Name: "+ getFirstName() + " "+ getLastName());
        System.out.println("Patient Age: "+ getAgeY() + " years "+ getAgeM() + " months ");
        vital.displayVitalDetails();
    }

    public void displayCurrentRecord(){
        System.out.println("Patient Name: "+ getFirstName() + " "+ getLastName());
        System.out.println("Patient Age: "+ getAgeY() + " years "+ getAgeM() + " months ");
        vital.displayCurrentDetails();
    }
    
    public boolean isThisVitalSignNormal(String vSign, int ageMo, int ageYrs, int value){
        boolean isNormal = false;
        if(vSign.equalsIgnoreCase("Respiratory Rate")){
            if((ageYrs >= 1 && ageYrs <= 12) && (value >= 20 && value <= 30)){
                isNormal = true;
            }else if(ageYrs >= 13 && (value >= 12 && value <= 20)){
                isNormal = true;
            }else if((ageMo >= 1 && ageMo <= 11) && (value >= 20 && value <= 30)){
                isNormal = true;
            }else if((ageYrs == 0 && ageMo == 0) && (value >= 30 && value <= 50)){
                isNormal = true;
            }
        }else if(vSign.equalsIgnoreCase("Heart Rate")){
            if((ageYrs >= 1 && ageYrs < 3) && (value >= 80 && value <= 130)){
                isNormal = true;
            }else if((ageYrs >= 3 && ageYrs <= 5) && (value >= 80 && value <= 120)){
                isNormal = true;
            }else if((ageYrs >= 6 && ageYrs <= 12) && (value >= 70 && value <= 110)){
                isNormal = true;
            }else if(ageYrs >= 13 && (value >= 55 && value <= 105)){
                isNormal = true;
            }else if((ageMo >= 1 && ageMo <= 11) && (value >= 80 && value <= 140)){
                isNormal = true;
            }else if((ageYrs == 0 && ageMo == 0) && (value >= 120 && value <= 160)){
                isNormal = true;
            }
        }else if(vSign.equalsIgnoreCase("Blood Pressure")){
            if((ageYrs >= 1 && ageYrs <= 5) && (value >= 80 && value <= 110)){
                isNormal = true;
            }else if((ageYrs >= 6 && ageYrs <= 12) && (value >= 80 && value <= 120)){
                isNormal = true;
            }else if(ageYrs >= 13 && (value >= 110 && value <= 120)){
                isNormal = true;
            }else if((ageMo >= 1 && ageMo <= 11) && (value >= 70 && value <= 100)){
                isNormal = true;
            }else if((ageYrs == 0 && ageMo == 0) && (value >= 50 && value <= 70)){
                isNormal = true;
            }
        }else if(vSign.equalsIgnoreCase("Weight")){
            if((ageYrs >= 1 && ageYrs < 3) && (value >= 22 && value <= 31)){
                isNormal = true;
            }else if((ageYrs >= 3 && ageYrs <= 5) && (value >= 31 && value <= 40)){
                isNormal = true;
            }else if((ageYrs >= 6 && ageYrs <= 12) && (value >= 41 && value <= 92)){
                isNormal = true;
            }else if(ageYrs >= 13 && value >= 110){
                isNormal = true;
            }else if((ageMo >= 1 && ageMo <= 11) && (value >= 9 && value <= 22)){
                isNormal = true;
            }else if((ageYrs == 0 && ageMo == 0) && (value >= 4.5 && value <= 7)){
                isNormal = true;
            }
        }
        
        return isNormal;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgeM() {
        return ageM;
    }

    public void setAgeM(int ageM) {
        this.ageM = ageM;
    }

    public int getAgeY() {
        return ageY;
    }

    public void setAgeY(int ageY) {
        this.ageY = ageY;
    }
}
