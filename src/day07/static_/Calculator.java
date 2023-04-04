package day07.static_;


public class Calculator {

    String color; //계산기 색상
    static double pi; //원주율, 공유해야되기 때문에 static 붙여줌

    //원의 넓이 구하는 메서드
    static double calcAreaCircle(int r){
        return pi*r*r;
    }

    //계산기에 색칠을 예쁘게 칠하는 기능
    void paint(String color){
        this.color = color;
    }
}
