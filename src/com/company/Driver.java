package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        ArrayList <registerStudent> registerlist=new ArrayList<>();
        ArrayList <recordResults> resultList=new ArrayList<>();
        ArrayList <Attendance> List=new ArrayList<>();
        ArrayList <AcademicCalendar> List1=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int a = 0;
        while(a!=5){
        System.out.println(" ---- Select the action you want to perform ---- ");
        System.out.println("| 1 : Register Student                          |");
        System.out.println("| 2 : Record Results                            |");
        System.out.println("| 3 : Fee Payment                               |");
        System.out.println("| 4 : Display Results                           |");
        System.out.println("| 5 : Show Attendance                           |");
        System.out.println("| 6 : Make Calendar                             |");
        System.out.println("| 7 : Show Calendar                             |");        
        System.out.println("| 8 : Exit                                      |");
        System.out.println(" ----------------------------------------------- ");
        
        System.out.print("Enter Option: ");
        a=input.nextInt();
        
        Scanner data=new Scanner(System.in);
        
        if(a==1){
           System.out.println("Enter student details:");
           System.out.print("Enter ID:");
           String x=data.nextLine();
           System.out.print("Enter Full Name:");
               String y=data.nextLine();
       
           System.out.print("Enter Address:");
               String z=data.nextLine();
       
           System.out.print("Enter Contact:");
               String l=data.nextLine();
       
           System.out.print("Enter Program:");
               String m=data.nextLine();
       
           System.out.print("Enter Session:");
               String n=data.nextLine();
       
           System.out.print("Enter Year:");
               String o=data.nextLine();
       
           System.out.print("Enter the fee paid:");
               String p=data.nextLine();
               registerlist.add(new registerStudent(x,y,z,l,m,n,o,p));
        }else if(a==2){
           System.out.println("Enter Result Details:");
           System.out.print("Enter ID:");
           String x=data.nextLine();
           System.out.print("Enter Full Name:");
               String y=data.nextLine();
       
           System.out.print("Enter Program:");
               String m=data.nextLine();
       
           System.out.print("Enter Course:");
               String n=data.nextLine();
       
           System.out.print("Enter marks for Assigment:");
               String o=data.nextLine();
       
           System.out.print("Enter marks for Qizzes:");
               String p=data.nextLine();
           System.out.print("Enter marks for Midterm:");
               String q=data.nextLine();
           System.out.print("Enter marks for Finals:");
               String r=data.nextLine();
               resultList.add(new recordResults(x,y,m,n,o,p,q,r));
                         List.add(new Attendance(x,y,m,n,"P"));
     
        }else if(a==3){
                for(int j=0;j<registerlist.size();j++){
                    if(Integer.valueOf(registerlist.get(j).feePayment)==0){
                       System.out.println("Fee not Paid By:");
                       System.out.println("ID :"+registerlist.get(j).id+"\nName: "+registerlist.get(j).fullname+"\nProgram: "+registerlist.get(j).program+"\nSession: "+registerlist.get(j).session+"\nYear: "+registerlist.get(j).year);
                    }
                }
        }else if(a==4){
            System.out.println("----------- Results -------------------");
            int sum;
            for
                    (int i=0;i<resultList.size();i++){
               sum=Integer.valueOf(resultList.get(i).assignments)+Integer.valueOf(resultList.get(i).quizzes)+Integer.valueOf(resultList.get(i).midterm)+Integer.valueOf(resultList.get(i).finals);
            System.out.println("ID; "+resultList.get(i).id+"\nName :"+resultList.get(i).name+"\nProgram: "+resultList.get(i).program+"\nCourse: "+resultList.get(i).course+"\nAssignments: "+resultList.get(i).assignments+"\nQuizzes: "+resultList.get(i).quizzes+"\nMidterm: "+resultList.get(i).midterm+"\nFinals: "+resultList.get(i).finals+"\nTotal Marks: "+sum);
            }
        }
            else if(a==5){
                for(int i=0;i<List.size();i++){
                System.out.println("ID; "+List.get(i).id+"\nName :"+List.get(i).name+"\nProgram: "+List.get(i).program+"\nCourse: "+List.get(i).course+"\nAttendance: "+List.get(i).attendance);
       
                }
                }else if(a==6){
        System.out.println("Enter Academic Calendar Details:");
           System.out.print("Enter Course Name:");
           String x=data.nextLine();
           System.out.print("Enter Assignment No:");
               String y=data.nextLine();
       
           System.out.print("Enter Quiz No:");
               String m=data.nextLine();
       
           System.out.print("Enter Midterm Name:");
               String n=data.nextLine();
           System.out.print("Enter Final Name:");
               String o=data.nextLine();
       
           System.out.print("Enter deadline:");
               String p=data.nextLine();
       List1.add(new AcademicCalendar(x,y,m,n,o,p));
        }else if(a==7){
            for(int i=0;i<List1.size();i++){
             System.out.println("Course; "+List1.get(i).course+"\nAssignments :"+List1.get(i).assignments+"\nQuizzes: "+List1.get(i).quizzes+"\nMidterm: "+List1.get(i).midterm+"\nFinals: "+List1.get(i).finals+"\nDeadline"+List1.get(i).deadline);
       
            }
        }else if(a==8){
        System.out.println("System Closed!");
        break;
        
        }
    }
   }
}
    

