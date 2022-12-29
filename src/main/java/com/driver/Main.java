package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return  "Invoking method from class A";
        }
    }
    public static class B{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String args[]){
        System.out.println("hello world");
        B b1 =new B();
        b1.meth();
    }
}
