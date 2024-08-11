package org.example.inheritance;

public class student {
    int rollnumber;
    String name;
    int psp;
     void batch(){
        System.out.println("my name is "+name+". my roll number is "+rollnumber+". my psp is "+psp);
    }
    public student(String name){
         System.out.println(name+" student");
    }
    public student(int rollnumber,String name,int psp){
         this.rollnumber=rollnumber;
         this.name=name;
         this.psp=psp;
    }
}
