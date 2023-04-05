package day08.poly.car;

//자동차 판매 대리점

import day04.Singer;

public class CarShop {

    Car[] cars;
//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] tucsons;


    //대리점에 차량 입고 기능
    public void importCar(){
        //원래 각각 나뉘던게 다형성으로 인해 공통된 Car로 통일
        Car m= new Mustang();
        Car s = new Stinger();
        Car t = new Tucson();

        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson()
        };

        //문자열과 정수와 논리를 배열에 담을 수 있는가?
        Object[] oArr = {
                50,30,3.3, "zzz", false,
                new Mustang()
        };
    }

    //주행 테스트 기능
    public void runTest(){

        importCar(); //차 입고
        for (Car car : cars){
            car.accelerate();
        }
    }


    //차를 고객에게 인도하는 기능
    public Car exportCar(int money){
        if(money ==6000){
            return new Mustang();
        }else if(money==5000){
            return new Stinger();
        }else if (money==3000){
            return new Tucson();
        }else{
            return null;
        }
    }
}
