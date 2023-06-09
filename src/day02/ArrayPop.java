package day02;

import java.util.Arrays;

public class ArrayPop {
  public static int pop(){

    if (arr.length>0) {
      //0.삭제 대상 데이터 백업
      int delTarget = arr[arr.length-1];
      //배열 가장 마지막에 있는 데이터 delTarget에 저장

      //1.원본 배열보다 1개 사이즈 작은 새 배열 생성
      int[] temp = new int[arr.length-1];
      //2.맨 마지막 데이터만 빼고 모두 새 배열에 복사
      for (int i = 0; i <arr.length-1; i++) {
        temp[i] = arr[i];
      }
      //3. 주소값 이전
      arr = temp;
      temp= null;

      return delTarget;
    }
    System.out.println("삭제 데이터 없음!");
    return 0;
  };//pop() 함수 끝

  static int[] arr = {10,20,30,40,50};

  public static void main(String[] args) {

  //배열의 맽 끝 데이터 삭제


    pop(); //[10,20,30,40]
//    pop(); //[10,20,30]
//    pop(); //[10,20]
//    pop(); //[10]
//    pop(); //[]

    System.out.println(Arrays.toString(arr));
  }
}
