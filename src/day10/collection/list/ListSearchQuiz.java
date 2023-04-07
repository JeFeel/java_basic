package day10.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSearchQuiz {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //ArrayList로 바꾸기
    List<String> tvxq = new ArrayList<>(
            Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
    );

    System.out.println("* 변경 전 정보: " + tvxq);


    while (true) {
      System.out.println("- 수정할 멤버의 이름을 입력하세요.");
      System.out.printf(">> ");
      String targetName = sc.nextLine();

      //탐색 알고리즘
      int index = -1;
      for (int i = 0; i < tvxq.size(); i++) {
        if (targetName.equals(tvxq.get(i))) {
          index = i;
          break;
        }
      }

      //수정 여부 판단
      if (index != -1) {
        System.out.printf("%s의 별명을 변경합니다.\n", targetName);
        System.out.printf(">> ");
        String newName = sc.next();
        tvxq.set(index, newName);
        System.out.println("변경 완료!!");
        System.out.println("* 변경 후 정보: " + tvxq);
        break;
      } else {
        System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
      }
    } //end while

    sc.close();
  }

}