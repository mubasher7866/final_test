package com.company;

public class Attendance {
     String id;
     String studentID;
     String courseID;
     String attendanceStatus;
     String createdAt;
     String updatedAt;
     String createdBy;
     String updatedBy;
     String name;
     String program;
     String course;
     String attendance;

    public Attendance(String id,String studentID, String courseID,String attendanceStatus,
                      String createdAt,String updatedAt,String createdBy,String updatedBy,
                      String name, String program, String course, String attendance) {
        this.id = id;
        this.studentID = studentID;
        this.courseID = courseID;
        this.attendanceStatus = attendanceStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.name = name;
        this.program = program;
        this.course = course;
        this.attendance = attendance;
    }

    public Attendance(String x, String y, String m, String n, String p) {
    }
}
