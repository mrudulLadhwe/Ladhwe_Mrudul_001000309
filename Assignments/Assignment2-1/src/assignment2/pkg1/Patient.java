/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg1;

/**
 *
 * @author mrudu
 */
public class Patient {
    
    public boolean isPatientNormal(int respRate, int hRate, int bloodPressure, 
            int ageM, int ageY, double weightInKg, double weightInLbs){
        boolean normal = false;
        
        if(ageY >= 1 && ageY < 3){
            normal = toddler(respRate, hRate, bloodPressure, weightInKg, weightInLbs);
            return normal;
        }else if(ageY >= 3 && ageY <= 5){
            normal = preSchooler(respRate, hRate, bloodPressure, weightInKg, weightInLbs);
            return normal;
        }else if(ageY >= 6 && ageY <= 12){
            normal = schoolAge(respRate, hRate, bloodPressure, weightInKg, weightInLbs);
            return normal;
        }else if(ageY >= 13){
            normal = adolescent(respRate, hRate, bloodPressure, weightInKg, weightInLbs);
            return normal;
        }else if(ageM >= 1 && ageM <= 11 && ageY == 0){
            normal = infant(respRate, hRate, bloodPressure, weightInKg, weightInLbs);
            return normal;
        }else if(ageM == 0 && ageY == 0){
            normal = newborn(respRate, hRate, bloodPressure, weightInKg, weightInLbs);
            return normal;
        }
        
        return normal;
    }
    
    public boolean newborn(int respiratoryRate, int heartRate, int bp, double weightKg, 
            double weightLbs){
	System.out.println("newborn>>>>>>>>>");
        boolean isNormal = false;
        
        if((respiratoryRate >= 30 && respiratoryRate <= 50) && (heartRate >= 120 && heartRate <= 160)
                && (bp >= 50 && bp <= 70) && (weightKg >= 2 && weightKg <= 3) &&
                (weightLbs >= 4.5 && weightLbs <= 7)){
            isNormal = true;
        }
        
        return isNormal;
    }
    
    public boolean infant(int respiratoryRate, int heartRate, int bp, double weightKg, 
            double weightLbs){
        System.out.println("infant>>>>>>>>>");
        boolean isNormal = false;
        
        if((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 140)
                && (bp >= 70 && bp <= 100) && (weightKg >= 4 && weightKg <= 10) &&
                (weightLbs >= 9 && weightLbs <= 22)){
            isNormal = true;
        }
        
        return isNormal;
    }
    
    public boolean toddler(int respiratoryRate, int heartRate, int bp, double weightKg, 
            double weightLbs){
		System.out.println("toddler>>>>>>>>>");
        boolean isNormal = false;
        
        if((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 130)
                && (bp >= 80 && bp <= 110) && (weightKg >= 10 && weightKg <= 14) &&
                (weightLbs >= 22 && weightLbs <= 31)){
            isNormal = true;
        }
        
        return isNormal;
    }
    
    public boolean preSchooler(int respiratoryRate, int heartRate, int bp, double weightKg, 
            double weightLbs){
        System.out.println("preSchooler>>>>>>>>>");
        boolean isNormal = false;
        
        if((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 120)
                && (bp >= 80 && bp <= 110) && (weightKg >= 14 && weightKg <= 18) &&
                (weightLbs >= 31 && weightLbs <= 40)){
            isNormal = true;
        }
        
        return isNormal;
    }
    
    public boolean schoolAge(int respiratoryRate, int heartRate, int bp, double weightKg, 
            double weightLbs){
        System.out.println("schoolAge>>>>>>>>>");
        boolean isNormal = false;
        
        if((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 70 && heartRate <= 110)
                && (bp >= 80 && bp <= 120) && (weightKg >= 20 && weightKg <= 42) &&
                (weightLbs >= 41 && weightLbs <= 92)){
            isNormal = true;
        }
        
        return isNormal;
    }
    
    public boolean adolescent(int respiratoryRate, int heartRate, int bp, double weightKg, 
            double weightLbs){
        System.out.println("adolescent>>>>>>>>>");
        boolean isNormal = false;
        
        if((respiratoryRate >= 12 && respiratoryRate <= 20) && (heartRate >= 55 && heartRate <= 105)
                && (bp >= 110 && bp <= 120) && (weightKg >= 50) &&
                (weightLbs >= 110)){
            isNormal = true;
        }
        
        return isNormal;
    }
    
}
