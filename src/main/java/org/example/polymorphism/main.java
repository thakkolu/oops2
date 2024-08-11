package org.example.polymorphism;

public class main {
    public static void main(String[] args) {
        a obj=new c();
        System.out.println(obj.a);
        obj.print();
        obj.print(12);
        a obj1=new b("sravani");
        System.out.println(obj1.b);
        a ob=new c();
        ob.print();

    }
}
