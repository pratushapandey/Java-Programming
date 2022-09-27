import java.lang.*;
import java.util.*;

class A{
    void m1(A a){
        System.out.println("m1 is the method of class A");
    }
}
class B extends A{
    void m1(A a){
        System.out.println("m1 is the method of class B");
    }
}
class Polymorphism{
    public static void main(String[]args){
        A a = new A();
        a.m1(a);
        a.m1(new B());

        B b = new B();
        b.m1(null);

        a = b;
        a.m1(null);
        a.m1(new A());
    }
}