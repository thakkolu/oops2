package org.example.polymorphism;

public class a {
    public int a,b;
    public void print(){
        System.out.println("inside no args a print method");
    }
    public void print(int a) {
        System.out.println(a + " inside parametrized print method");
    }
    public a(){
        System.out.println("inside a");
    }
}

