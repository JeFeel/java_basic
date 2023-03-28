package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) throws IOException {

        String dog = "멍뭉이", cat = "야옹이";

        System.out.print(dog);
        System.out.print(cat);
//        print는 줄바꿈을 자동으로 안 해준다

        int month = 10;
        int day = 3;
        String anni = "개천절";

        System.out.println(month + "월" + day + "일은" + anni + "입니다.");

//        souf
//        %d:정수, %s: 문자열, %f: 실수
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);

        double rate = 25.4567;
//        %f: 무조건 자리수를 6자리로 표현
        System.out.printf("오늘의 할인율은 %.2f입니다.\n", rate);
        System.out.printf("오늘의 할인율은 %.4f입니다.\n", rate);
        System.out.printf("오늘의 할인율은 %.1f%%입니다.\n", rate);

        //표준 입력
        Scanner sc = new Scanner(System.in);
//        int result = sc.nextInt();
////        System.out.println("result = " + result);

        String str = sc.nextLine();


        int result = 0;
        try {
            //str를 정수변환
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정수로 입력하거라");
        }

        System.out.println("result = " + result);

    }
}
