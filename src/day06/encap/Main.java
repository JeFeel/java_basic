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
        //조건 충족x --> 0 리턴

        myCar.setMode('A');
        System.out.println(myCar.getMode());
        //switch의 default가 출력됨

        myCar.pressButton(); //미리 안에서 순서를 정해둔 캡슐이 실행됨

    }
}
