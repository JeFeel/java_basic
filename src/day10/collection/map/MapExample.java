package day10.collection.map;


import day07.util.Utility;
import quiz2.Artist;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        
        // put(key, value) : 데이터 추가
        map.put("지갑잔액", 500);
        map.put("좋아하는 가수",new Artist("동방신기", null));
        map.put("저녁메뉴", "볶음밥");
        
        System.out.println(map.size()); //3, key+value=하나의 entry --> entry의 개수를 판단
        
        //get(key) : 데이터 참조
        String dinner = (String) map.get("저녁메뉴");  //다운캐스팅
        System.out.println("dinner = " + dinner);

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info();

        map.put("저녁메뉴", "짬뽕"); //저녁메뉴 수정
        System.out.println(map);


        // 반복문 처리
        //index가 없기 때문에 fori문 사용 불가
//        for (Object o : map) {} //iterable이 없기 때문에 사용 불가
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
            Utility.makeLine();
        }



    }


}
