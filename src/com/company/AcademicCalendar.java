package com.company;

public class AcademicCalendar {
    String course;
    String assignments;
    String quizzes;
    String finals;
    String midterm;
    String deadline;

    
    public AcademicCalendar(String course, String assignments, String quizzes,String midterm,String finals, String deadline) {
        this.course = course;
        this.assignments = assignments;
        this.quizzes = quizzes;
        this.midterm=midterm;
        this.finals = finals;
        this.deadline = deadline;
    }
    
}   
