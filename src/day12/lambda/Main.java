package day12.lambda;

import day05.member.Gender;
import day05.member.Member;
import day07.util.Utility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.map;
import static day12.lambda.MappingApple.mappingAppleByColor;

public class Main {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========= 녹색 사과 필터링 ========");
        List<Apple> greenApples
                = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("======= 노랑 사과 필터링 =========");
        List<Apple> colorApples
                = filterApplesByColor(appleBasket, YELLOW);

        for (Apple ca : colorApples) {
            System.out.println(ca);
        }

        System.out.println("======= 원하는 조건으로 필터링 ======");

        // 100g 이하 사과들
        List<Apple> filterApples
                = filterApples(appleBasket, new LightApplePredicate());
        for (Apple filterApple : filterApples) {
            System.out.println(filterApple);
        }

        Utility.makeLine();
        // 빨강 사과 필터링
        List<Apple> filterApples1 = filterApples(appleBasket, apple -> apple.getColor() == RED); //람다식
        for (Apple apple : filterApples1) {
            System.out.println(apple);
        }

        Utility.makeLine();

        // 녹색이면서 100g보다 큰 사과들만 필터링 (익명)
        List<Apple> filterApples2 = filterApples(appleBasket, apple -> apple.getWeight() > 100 && apple.getColor() == GREEN);
        for (Apple apple : filterApples2) {
            System.out.println(apple);
        }

        Utility.makeLine();

        filter(appleBasket, apple -> apple.getWeight() >= 100 && apple.getWeight() <= 150);


        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<Integer> filter = filter(numbers, n -> n % 2 == 0);
        System.out.println("filter = " + filter);

        List<String> wordList = List.of(
                "moments", "hello", "apple", "banana", "ace", "base", "zebra"
        );
        List<String> filter1 = filter(wordList, w -> w.length() == 5);
        System.out.println("filter1 = " + filter1);


        List<String> filter3
                = wordList.stream()
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList());

        System.out.println("filter3 = " + filter3);

        Utility.makeLine();

        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);


        //회원정보에서 회원의 닉네임만 추출
        List<Member> memberList = List.of(
                new Member("abc1@ddd.com", "1234", "홍길동", 1 , Gender.MALE, 33)
                ,new Member("abc2@ddd.com", "4444", "김길동", 2 , Gender.FEMALE, 23)
                ,new Member("abc3@ddd.com", "3333", "이길동", 3 , Gender.MALE, 43)
                ,new Member("abc4@ddd.com", "5555", "박길동", 4 , Gender.FEMALE, 53)
                ,new Member("abc5@ddd.com", "1111", "송길동", 5 , Gender.MALE, 63)
        );

        List<String> nameList =
                map(memberList, m-> m.memberName);
        System.out.println("nameList = " + nameList);

    }
}