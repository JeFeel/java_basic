package day10.generic;


import day04.array.StringList;
import quiz2.Artist;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

//        Basket apples = new Basket();
//        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); //의도치 않게 바나나도 담을 수 있음
        //따라서 generic을 활용해서 방지

        Basket<Apple> apples = new Basket<Apple>();
        //현재 Java에서는 뒤 <> 안의 내용은 생략 가능
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); //바나나 담기 불가능

        Apple fruit = apples.getFruit();
        //=============================================

        Basket<Banana> bananas = new Basket<Banana>();
//        bananas.setFruit(new Apple());    //사과 담기 불가능
        bananas.setFruit(new Banana());

        Banana fruit1 = bananas.getFruit();

        //ArrayList<Integer> objects = new ArrayList<>();

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");
        System.out.println(sl);
        MyList<Integer> numbers = new MyList<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println(numbers);

        MyList<Artist> artists = new MyList<>();
//        artists.push("동방신기", new StringList(...initData));

    }
}
