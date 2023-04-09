package day06.modi.pac1;

class B { //앞에 public 지우면 default 제한 걸림 : 클래스에는 public과 default만 사용가능하게 됨

    public int x1;
    int x2;
    private int x3;

    void test(){
        A a = new A();
        new A(10);  //default
//        new A("zzz"); //private
        a.f1 = 1; //public
        a.f2 = 2; //default
//        a.f3 = 3; //private, 불가능

        a.m1(); //public
        a.m2(); //default
//        a.m3(); //private

    }

    //B는 A랑 같은 패키지 안ㅇ 있으므로 default 제한자까지는 불러들일 수 있음
}
