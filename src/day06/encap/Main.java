package day06.encap;


public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("그렌저"); //생성자는 한번만 호출됨 --> 더 이상 못 씀


//private으로 바꿔서 main에서는 변경 불가
//        myCar.model = "페라리488";
//        myCar.speed = -10000;
//        myCar.mode = 'A';


        myCar.setSpeed(500);
        System.out.println(myCar.getSpeed());

        myCar.setMode('A');
        System.out.println(myCar.getMode());

        myCar.pressButton();




    }
}
