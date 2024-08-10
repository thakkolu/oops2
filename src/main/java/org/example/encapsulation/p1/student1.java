package org.example.encapsulation.p1;

public class student1 {
    protected int rollno;
    public String name;
    public int psp;
    void changebatch(){
        System.out.println(name+" is changed batch");
    }
    void newbatch(){
        System.out.println(name+" is new to the batch");
    }
    public student1(){
       this.name="sravan";
       this.psp=9;
       System.out.println("i am inside no args constructor");
    }
    public student1(String name,int psp){
        this.name=name;
        this.psp=psp;
        System.out.println("i am inside parametrized constructor");
    }
}
