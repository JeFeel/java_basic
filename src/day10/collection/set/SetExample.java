package day10.collection.set;

import java.util.*;

import static day07.util.Utility.makeLine;

/*
* - 집합 자료구조
*  - 저장순서를 보장하지 않음
*  - 인덱스, 키를 사용하지 않아서 개별탐색이 불리함
*  - 저장값의 중복을 허용하지 않음☆☆
* */

public class SetExample {

    public static void main(String[] args) {

        Set<String> foodSet = new HashSet<>();

        // 데이터 추가 add(E e)
        boolean flag1 = foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        boolean flag2 = foodSet.add("김말이");
        foodSet.add("김밥");
        //[김밥, 김말이, 단무지, 닭꼬치] 중복 없음! 순서도 없음!

        System.out.println(foodSet);
        System.out.println(foodSet.size());

        makeLine();

        System.out.println("flag1 = " + flag1); //true
        System.out.println("flag2 = " + flag2); //false

        for (String food : foodSet) {
            System.out.println("food = " + food);
        }

        //fori 구문은 사용 불가

        //remove(obj) : 삭제
        foodSet.remove("단무지");
        System.out.println("foodSet = " + foodSet);

        makeLine();

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,1,1,3,3,5,7,9,9)
        );

        //리스트를 set으로 변환
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

    }

}
