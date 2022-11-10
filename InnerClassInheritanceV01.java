package com.LearnNestedClass;

class Zuer{
    int value;
    class Inner{
        int number;
        void copy(){
            number=24;
            System.out.println(number);
        }
    }
}
class OuerPlus extends Zuer{
    int digit;
    
}
public class InnerClassInheritanceV01 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Outer out = new Outer();
        OuerPlus oplus = new OuerPlus();
        //oplus.Inner inC = oplus.new Inner(); tried  to access Inner class  similar to field
        OuerPlus.Inner  in = oplus.new Inner();
        in.copy();
    }
}
