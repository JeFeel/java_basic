package day11.api.obj;


import java.util.List;
import java.util.Objects;
//import java.lang.String;
//java.lang 패키지의 클래스들은 import 생략 가능

public class Pen  extends Object{

    Company company; //제조 회사


//    List<String> list;
    long serial; //시리얼 번호
    String color; //색상
    int price; //가격

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    //객체의 필드데이터를 빠르게 확인해볼때 hashcode 확인


    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    //시리얼 번호가 같으면 같은 객체로 보고 싶다
    // equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩 해라

    @Override
    public boolean equals(Object obj) {

         if(obj instanceof Pen){
             Pen target = (Pen) obj; //obj객체의 타입 Object를 다운캐스팅
             return this.serial == target.serial && this.color.equals(target.color);
         }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }

}
