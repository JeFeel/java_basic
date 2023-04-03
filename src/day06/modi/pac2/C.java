package day06.modi.pac2;


import day06.modi.pac1.A;

public class C {
    void test(){
        A a =new A();

//        new A(11); //default
//        new A("zzzz"); //private
        a.f1 = 10; //public
//        a.f2 = 20; //default  다른 패키지 소속이라=
//        a.f3 = 30; //private

        a.m1(); //public
//        a.m2();   //default
//        a.m3();   //private

//        B b =new B(); //다른 패키지의 class B가 default라 접근이 불가능
//        b.x1 = 1;
    }

}
