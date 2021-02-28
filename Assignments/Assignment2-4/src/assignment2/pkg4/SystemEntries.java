/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrudu
 */
public class SystemEntries {

    static List<Patient> patientList = new ArrayList<>();
    static List<Person> personList = new ArrayList<>();

    public static List<Patient> getPatientList() {
        return patientList;
    }

    public static void setPatientList(List<Patient> patientList) {
        SystemEntries.patientList = patientList;
    }

    public static List<Person> getPersonList() {
        return personList;
    }

    public static void setPersonList(List<Person> personList) {
        SystemEntries.personList = personList;
    }

    public static void displayPatientList() {
        System.out.println("Patient>>>>>>>>>");
        for (int i = 0; i < patientList.size(); i++) {
            System.out.println("Patient Id: " + patientList.get(i).getPatientId());
            System.out.println("Full Name: " + patientList.get(i).getFirstName()
                    + " " + patientList.get(i).getLastName());
            System.out.println("Age: " + +patientList.get(i).getAgeY()
                    + " years " + patientList.get(i).getAgeM() + " months");

            List<Encounter> encount = patientList.get(i).getEncounterList();
            for (int j = 0; j < encount.size(); j++) {
                System.out.println("Respiratory Rate: " + encount.get(j).getVital().getRespiratoryRate());
                System.out.println("Heart Rate: " + encount.get(j).getVital().getHeartRate());
                System.out.println("Blood Pressure: " + encount.get(j).getVital().getBp());
                System.out.println("Weight in Lbs: " + encount.get(j).getVital().getWeightLb());
                System.out.println("Weight in Kgs: " + encount.get(j).getVital().getWeightKg());
                System.out.println("Date: " + encount.get(j).getDate());
                System.out.println("-----------------------------------------------------");
            }
            System.out.println();
        }
    }

    public static void displayPersonList() {
        System.out.println("Person>>>>>>>>>");
        for (int i = 0; i < personList.size(); i++) {
            System.out.println("Full Name: " + personList.get(i).getFirstName()
                    + " " + personList.get(i).getLastName());
            System.out.println("Age: " + personList.get(i).getAgeY()
                    + " years " + personList.get(i).getAgeM() + " months");
            System.out.println("--------------------------------------------");
        }
    }

    public void displaySpecifiedPatient(int patientId) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getPatientId() == patientId) {
                System.out.println("Patient Id: " + patientList.get(i).getPatientId());
                System.out.println("Full Name: " + patientList.get(i).getFirstName()
                        + " " + patientList.get(i).getLastName());
                System.out.println("Age: " + +patientList.get(i).getAgeY()
                        + " years " + patientList.get(i).getAgeM() + " months");

                List<Encounter> encount = patientList.get(i).getEncounterList();
                for (int j = 0; j < encount.size(); j++) {
                    System.out.println("Respiratory Rate: " + encount.get(j).getVital().getRespiratoryRate());
                    System.out.println("Heart Rate: " + encount.get(j).getVital().getHeartRate());
                    System.out.println("Blood Pressure: " + encount.get(j).getVital().getBp());
                    System.out.println("Weight in Lbs: " + encount.get(j).getVital().getWeightLb());
                    System.out.println("Weight in Kgs: " + encount.get(j).getVital().getWeightKg());
                    System.out.println("Date: " + encount.get(j).getDate());
                    System.out.println("----------------------------------------------------------");
                }
            }
        }
    }

    public void displayPatientCurrRecord(int pId) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getPatientId() == pId) {
                System.out.println("Patient Id: " + patientList.get(i).getPatientId());
                System.out.println("Full Name: " + patientList.get(i).getFirstName()
                        + " " + patientList.get(i).getLastName());
                System.out.println("Age: " + +patientList.get(i).getAgeY()
                        + " years " + patientList.get(i).getAgeM() + " months");

                List<Encounter> encount = patientList.get(i).getEncounterList();
                System.out.println("Respiratory Rate: " + encount.get(encount.size()-1).getVital().getRespiratoryRate());
                System.out.println("Heart Rate: " + encount.get(encount.size()-1).getVital().getHeartRate());
                System.out.println("Blood Pressure: " + encount.get(encount.size()-1).getVital().getBp());
                System.out.println("Weight in Lbs: " + encount.get(encount.size()-1).getVital().getWeightLb());
                System.out.println("Weight in Kgs: " + encount.get(encount.size()-1).getVital().getWeightKg());
                System.out.println("Date: " + encount.get(encount.size()-1).getDate());

            }
        }
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

}
