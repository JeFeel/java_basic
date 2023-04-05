package day08.poly.car;

import day07.util.Utility;

import static day07.util.Utility.*;

public class Main {

    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Stinger());

        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Stinger stinger = new Stinger();
        stinger.accelerate();
        
        makeLine();

//        Car car = shop.exportCar(6000);
//        Mustang car = (Mustang) shop.exportCar(6000);
        //다운캐스팅 때문에 Mustang 붙여줌

//        car.powerSound(); //머스탱만의 기능을 호출하기 위해
//        System.out.println("car = " + car);

        Car car = shop.exportCar(5000);

        System.out.println(car instanceof Stinger);
        System.out.println(car instanceof Tucson);
        System.out.println(car instanceof Mustang);


    }
}