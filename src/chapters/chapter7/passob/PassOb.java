package chapters.chapter7.passob;

import chapters.chapter7.passob.Test;

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1==ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1==оbЗ: " + ob1.equalTo(ob3));
        Test ob = new Test();
        int a = 15;
        int b = 20;
        System.out.println("a и b до вызова метода: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a и b после вызова метода: " + a + " " + b);
        Test ob4=new Test(15,20);
        System.out.println("ob.a и ob.b до вызова метода: " + ob4.a + " " + ob4.b);
        ob.meth(ob4);
        System.out.println("ob.a и ob.b после вызова метода: " + ob4.a + " " + ob4.b);
    }
}