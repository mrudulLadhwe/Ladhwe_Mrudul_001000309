/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mrudu
 */
public class VitalSigns {
    
    private int respiratoryRate;
    private int heartRate;
    private int bp;
    private double weightKg;
    private double weightLb;
    int current;
    
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    private String date = df.format(dateobj);
    
    ArrayList<VitalSigns> list = new ArrayList<>();

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightLb() {
        return weightLb;
    }

    public void setWeightLb(double weightLb) {
        this.weightLb = weightLb;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public VitalSigns newVitalSign(int respRate, int heaRate, int bloodP,
            double weightLb, double weightKg){
        
        VitalSigns vital = new VitalSigns();
        vital.setRespiratoryRate(respRate);
        vital.setHeartRate(heaRate);
        vital.setBp(bloodP);
        vital.setWeightKg(weightKg);
        vital.setWeightLb(weightLb);
        
        list.add(vital);
        current = list.size()-1;
        
        return vital;
    }
    
    public void displayVitalDetails(){
        for(int i = 0; i < list.size(); i++){
            System.out.println("Patient History: " + (i+1));
            System.out.println("Respiratory Rate :" + list.get(i).getRespiratoryRate());
            System.out.println("Heart Rate :" + list.get(i).getHeartRate());
            System.out.println("Blood Pressure :" + list.get(i).getBp());
            System.out.println("Weight in Lbs :" + list.get(i).getWeightLb());
            System.out.println("Weight in Kgs :" + list.get(i).getWeightKg());
            System.out.println("Date :" + list.get(i).getDate());
            System.out.println();
        }
    }
    
    public void displayCurrentDetails(){
            System.out.println("Patient Current History: ");
            System.out.println("Respiratory Rate :" + list.get(current).getRespiratoryRate());
            System.out.println("Heart Rate :" + list.get(current).getHeartRate());
            System.out.println("Blood Pressure :" + list.get(current).getBp());
            System.out.println("Weight in Lbs :" + list.get(current).getWeightLb());
            System.out.println("Weight in Kgs :" + list.get(current).getWeightKg());
            System.out.println("Date :" + list.get(current).getDate());
  
    }
    
}
