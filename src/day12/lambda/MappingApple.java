package day12.lambda;

// 사과 중에 원하는 필드들만 추출해서 새로운 리스트 만들기

import java.util.ArrayList;
import java.util.List;

public class MappingApple {


    //사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> basket) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : basket) {
            Color color = apple.getColor();
            colorList.add(color);
        }
        return colorList;
    }

    public static <X,Y> List<Y> map(List<X> basket, GenericFunction<X, Y> mapper) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : basket) {
            Y y = mapper.apply(x);
            mappedList.add(y);
        }
        return mappedList;
    }

}