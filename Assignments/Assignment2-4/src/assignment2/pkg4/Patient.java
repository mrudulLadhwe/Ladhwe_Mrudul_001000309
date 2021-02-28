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
public class Patient extends Person {

    private List<Encounter> encounterList = new ArrayList<>();
    private int patientId;

    public Patient(String firstName, String lastName, int ageM, int ageY) {
        super(firstName, lastName, ageM, ageY);
    }


    public List<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(List<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    

}
