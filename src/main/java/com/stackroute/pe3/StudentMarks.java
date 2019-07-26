package com.stackroute.pe3;


public class StudentMarks {
    int sum=0,average=0;


    public String StudentGrade(int noOfStudents,int studentGrades[]){

        for(int i=0;i<noOfStudents;i++){
             sum=sum+studentGrades[i];
            average=sum/noOfStudents;
        }
        if(average<100){
            return "with in a range";
        }
        else
            return  "not in a range";

}}
