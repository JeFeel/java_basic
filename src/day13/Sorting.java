package day13;


import day07.util.Utility;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.util.Utility.*;
import static day13.Menu.menuList;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {

        //stream의 정렬 sorted

        //메뉴 목록 중 칼로리가 낮은 순으로 정렬

        menuList.stream()
                .sorted(comparing(Dish::getType))
                .collect(toList())
                .forEach(d-> System.out.println(d));
        makeLine();
        //메뉴 목록 중 이름으로 내림차 정렬 (zyx순)
        menuList.stream()
                .sorted(comparing((Dish dish) -> dish.getName()).reversed())
                .collect(toList())
                .forEach(d-> System.out.println(d));

        makeLine();

        menuList.stream()
                .filter(d->d.getCalories() >300)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3) //앞에서 3개 추출
                .collect(toList())
                .forEach(d-> System.out.println(d));

    }
}
