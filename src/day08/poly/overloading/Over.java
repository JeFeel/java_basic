package day08.poly.overloading;


/*
* 오바라이딩: 부모클래스의 메서드를 자식이 재정의
* 오버로딩: 하나의 클래스 안에서 같은 이름의 메서드를 여러 개 선언
*           단, 반드시 파라미터 (매개변수의 타입, 순서, 개수)가 달라야 함
*           리턴타입과 접근제한자는 관련이 없다.
* */
public class Over {


    // alertType(String)
    //데이터를 전달하면 데이터의 타입을 알려주는 기능
    void alertType(String s){
        System.out.println("전달되는 데이터는 문자열입니다.");
    }
    // alertType(int)
    void alertType(int x){ //타입이 다름
        System.out.println("전달된 데이터는 정수입니다.");
    }
    // alertType(int, int)
    void alertType(int x, int y){}//개수가 다름

    void alertType(int x, String y){}
    void alertType(String x, int y){}


    void test(){
        alertType("zzz", 10);
        System.out.println();
    }
}
