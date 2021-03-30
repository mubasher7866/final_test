package com.company;

public class registerStudent {
        String id;
        String fullname;
        String address;
        String contact;
        String program;
        String session;
        String year;
        String feePayment;
      
    public registerStudent(String id, String fullname, String address, String contact, String program, String session, String year,String fee) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.contact = contact;
        this.program = program;
        this.session = session;
        this.year = year;
        this.feePayment=fee;
    }

}
