package day07.protect.pac2;


import day07.protect.pac1.A;

public class D extends A {
    D(){

        super(10);
//        super("zzz"); //접근 불가

        f1=1;
//        f2=2; //접근 불가

        m1();
//        m2(); //접근 불가


        //protected는 super로 접근 가능(상속을 통해 접근)하지만 default는 불가
    }

}
