/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    
    Seat seat;
    CourseLoad courseload;
    
    public SeatAssignment(Seat s){
        seat = s;
//        courseload = cl;
    }
        public SeatAssignment(){

    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public String getCourseOffer(){
        return seat.getCourseName();
    }
    
    public int getCourseCredit(){
        return seat.getCourseCredit();
    }
    
    public double getGradePoints(){
        return seat.getGradePoint();
    }
}
