package day07.static_;

import day07.util.Utility;

//static 필드와 메서드를 그냥 참조 가능
import static day07.util.Utility.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        out.println(Count.x);
        out.println(random());
        //Math가 private이라 객체 생성이 안 됨

        Count.m1(new Count());

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2();

//        c1.x = 10;
        Count.x = 10; //어차피 메모리에 x는 하나밖에 없기 때문에 가능
        c2.y = 20;


        Count.x++;

        out.printf("c1 = x: %d, y: %d\n", Count.x, c1.y); //10,0
        out.printf("c2 = x: %d, y: %d\n", Count.x, c2.y); //10,20
        //왜 c2의 x가 10으로 바뀌었나?
        //왜 c2만 건드렸는데 공유되나?

        //static과 인스턴스 field의 차이


        Calculator cal1 = new Calculator(); //kim
        Calculator cal2 = new Calculator(); //park

        cal1.color="빨강";
        cal2.color="초록";

        out.println("cal1 = " + cal1.color);
        out.println("cal2 = " + cal2.color);

        Calculator.calcAreaCircle(5);

        makeLine();
        makeLine();
        makeLine();
        makeLine();
        makeLine();
        makeLine();

        input("하하호호: ");


    }


}
