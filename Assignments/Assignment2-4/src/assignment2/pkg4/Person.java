/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg4;

/**
 *
 * @author mrudu
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private int ageM;
    private int ageY;

    public Person(String firstName, String lastName, int ageM, int ageY) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageM = ageM;
        this.ageY = ageY;
    }

    public String isPerson(){
        System.out.println("firstname>>>>>>"+firstName);
        System.out.println("age>>>>>>"+ageY);
        return lastName;
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
