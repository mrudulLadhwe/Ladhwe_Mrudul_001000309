/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;
    String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();

    }

    public CourseOffer newCourseOffer(String n) {

        Course c = coursecatalog.getCourseByNumber(n);
        if(c == null)return null;
        CourseOffer co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }
    
    
    public int calculateTotalLoss() {
        int sum = 0;
        for (CourseOffer co : schedule) {
            sum = sum + co.getTotalCourseLoss();
        }
        return sum;
    }
    
    public String getPopularCourse() {
        float percentTage = 0;
        String course = new String("");
        for (CourseOffer co : schedule) {
            float a = co.getOccupiedSeats();
            float b = co.getTotalSeats();
            float coursePercentTage = (a/b) * 100;
            System.out.println("occupied " + co.getCourseName() + " seats " + co.getOccupiedSeats());
            if (coursePercentTage > percentTage) {
                percentTage = coursePercentTage;
                course = co.getCourseName();
            }
        }
        return course;
    }

    public ArrayList<CourseOffer> getSchedule() {
        return schedule;
    }
}
