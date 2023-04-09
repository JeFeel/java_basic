package day10.collection.map;


import day07.util.Utility;
import quiz2.Artist;

import java.util.HashMap;
import java.util.Map;

import static day07.util.Utility.makeLine;

public class MapExample {

    public static void main(String[] args) {
        //Map의 가장 큰 특징 >> key와 value를 활용

        Map<String, Object> map = new HashMap<>();
        
        // put(key, value) : 데이터 추가
        map.put("지갑잔액", 500);
        map.put("좋아하는 가수",new Artist("동방신기", null));
        map.put("저녁메뉴", "볶음밥");
        System.out.println(map);
        System.out.println(map.size()); //3, key+value=하나의 entry --> entry의 개수를 판단

        makeLine();

        //get(key) : 데이터 참조
        String dinner = (String) map.get("저녁메뉴");  //다운캐스팅
        System.out.println("dinner = " + dinner);

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info(); //Artist 클래스의 함수 사용

        map.put("저녁메뉴", "짬뽕"); //저녁메뉴 수정
        //이미 key가 존재한다면 추가 대신 수정으로 기능함
        System.out.println(map);


        // 반복문 처리
        //index가 없기 때문에 fori문 사용 불가
//        for (Object o : map) {} //iterable이 없기 때문에 사용 불가
        //하지만 map.keySet()를 활용한 iter는 가능?  (형태만 iter인가?)

        for (String key : map.keySet()) {
            makeLine();
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
            makeLine();
        }





    }


}
