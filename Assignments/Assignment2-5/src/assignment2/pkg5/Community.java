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
public class Community {
    
    static List<House> houseList = new ArrayList<>();
    List<House> commuA = new ArrayList<>();
    List<House> commuB = new ArrayList<>();

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public List<House> getCommuA() {
        return commuA;
    }

    public void setCommuA(List<House> commuA) {
        this.commuA = commuA;
    }

    public List<House> getCommuB() {
        return commuB;
    }

    public void setCommuB(List<House> commuB) {
        this.commuB = commuB;
    }
    
    
    
    /*public void displayAllHouseList(){
        System.out.println(">>>>>"+houseList.size());
        for(int i = 0; i <houseList.size(); i++){
            System.out.println(">>>>>"+houseList.get(i).getZipCode());
            System.out.println(">>>>>"+houseList.get(i).getApt());
        }
    }*/
    
    public void whichCommunity(){
        for(int i = 0; i <houseList.size(); i++){
            if(houseList.get(i).getZipCode() == 2215){
                commuA.add(houseList.get(i));
            }else if(houseList.get(i).getZipCode() == 2216){
                commuB.add(houseList.get(i));
            }
        }
    }
    
    
}
