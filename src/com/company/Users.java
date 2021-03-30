package com.company;

import java.util.Date;

public class Users {

    int ID;
    String name;
    int roleID;
    String username;
    String password;
    String email;
    String mobileNo;
    Date DOB;
    String address;
    String createdAt;
    String updatedAt;
    String createdBy;
    String updatedBy;

    public Users (    int ID,String name,int roleID,String username,String password,String email,
                      String mobileNo,Date DOB, String address, String createdAt,String updatedAt,
                      String createdBy,String updatedBy){

        this.ID=ID;
        this.name=name;
        this.roleID=roleID;
        this.username=username;
        this.password=password;
        this.email=email;
        this.mobileNo=mobileNo;
        this.DOB=DOB;
        this.address=address;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
        this.createdBy = createdBy;
        this.updatedBy=updatedBy;

    }
}
