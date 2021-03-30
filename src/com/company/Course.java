package com.company;

import java.util.Date;

public class Course {

    int ID;
    String name;
    String courseFee;
    String description;
    Date courseYear;
    String studentID;
    String createdAt;
    String updatedAt;
    String createdBy;
    String updatedBy;

    public Course(String name,String courseFee,String description,  Date courseYear,String studentID, String createdAt,
                  String updatedAt,String createdBy,String updatedBy) {

        this.ID = ID;
        this. name = name;
        this.courseFee = courseFee;
        this.description= description;
        this.courseYear= courseYear;
        this.studentID= studentID;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
        this.createdBy = createdBy;
        this.updatedBy=updatedBy;

    }
}