package day08.poly;


class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

//D-B-A 따라서 D-A는 상속관계

public class Basic {
    //<<다형성>>

    //자식객체는 상속관계에 있는 상위타입을 사용할 수 있다!
    //Object는 모든 객체의 최상위 클래스
    Object x1= new A();
    A x2= new B();
    A x3= new C();
    A x4= new D();
    A x5= new E();  // 부모인 C, A타입 사용 가능

    void test(){
        int a = 10;
        double b = a;

        B x = new B();
        A z = x;
//        C y = z; //A가 더 크니까 불가능
    }


}
