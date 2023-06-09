package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void push() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String food = sc.nextLine();

            if (food.equals("그만")) break;

            String[] newFoodList = new String[foodList.length + 1]; //기존에서 하나 더 큰 배열 생성
            for (int i = 0; i < foodList.length; i++) {
                newFoodList[i] = foodList[i];
            } //기존 요소들 새 배열에 저장

            newFoodList[newFoodList.length - 1] = food; //새 배열의 마지막 자리를 새로운 data로 받음
            foodList = newFoodList;
            newFoodList = null; //주소값 이전
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(foodList));
    }

    static String[] foodList = new String[0]; //빈 배열 상태

    public static void main(String[] args) {
//        String[] foodList = {};

        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */
        System.out.println("# 먹고 싶은 음식을 입력하세요!");
        System.out.println("# 입력을 중시하려면 <그만>이라고 입력하세요");

        push();
    }
}
