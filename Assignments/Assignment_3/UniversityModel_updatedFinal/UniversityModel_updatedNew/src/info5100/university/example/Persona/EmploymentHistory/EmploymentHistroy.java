/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(String job, String employerName){
        Employment ne = new Employment(job, employerName);
        employments.add(ne);
        return ne;
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }
    
    
    
}