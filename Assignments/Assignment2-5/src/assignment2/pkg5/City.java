/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrudu
 */
public class City {
    
    List<House> comA = new ArrayList<>();
    List<House> comB = new ArrayList<>();

    public List<House> getComA() {
        return comA;
    }

    public void setComA(List<House> comA) {
        this.comA = comA;
    }

    public List<House> getComB() {
        return comB;
    }

    public void setComB(List<House> comB) {
        this.comB = comB;
    }
    
    public void ComAbnormal(List<House> com){
        int countNormal =0;
        int countAbnormal = 0;
        for(int i=0; i < com.size(); i++){
            int bp = com.get(i).getP().getEncounterList().get(0).getVital().getBp();
            int ageYrs = com.get(i).getP().getAgeY();
            int ageMo = com.get(i).getP().getAgeM();
            System.out.println("Blood Pressure: "+bp + "\t Age: "+ageYrs + " yrs " + ageMo+ " months");
            if((ageYrs >= 1 && ageYrs <= 5) && (bp >= 80 && bp <= 110)){
                countNormal++;
            }else if((ageYrs >= 6 && ageYrs <= 12) && (bp >= 80 && bp <= 120)){
                countNormal++;
            }else if(ageYrs >= 13 && (bp >= 110 && bp <= 120)){
                countNormal++;
            }else if((ageMo >= 1 && ageMo <= 11) && (bp >= 70 && bp <= 100)){
                countNormal++;
            }else if((ageYrs == 0 && ageMo == 0) && (bp >= 50 && bp <= 70)){
                countNormal++;
            }
        }
        
        countAbnormal = com.size() - countNormal;
        
        System.out.println("Total people: "+com.size());
        System.out.println("People with Normal Blood Pressure: "+countNormal);
        System.out.println("People with Abnormal Blood Pressure:"+countAbnormal);
    }
    
}
