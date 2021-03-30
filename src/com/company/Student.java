package com.company;

public class Student {

    int ID;
    String studentID;
    String createdAt;
    String updatedAt;
    String createdBy;
    String updatedBy;

    public Student (int ID,String studentID,String createdAt,
                    String updatedAt,String createdBy,String updatedBy){

        this.ID = ID;
        this.studentID= studentID;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
        this.createdBy = createdBy;
        this.updatedBy=updatedBy;

    }
}
