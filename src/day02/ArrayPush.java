package day02;

import java.util.Arrays;

public class ArrayPush {

  public static void push(int newData) {

    //1. 원본 배열보다 더 큰 사이즈의 배열 새로 생성
    int[] temp = new int[arr.length+1];

    //2. 원본 배열 데이터를 새 배열로 복사
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }

    //3. 새 데이터를 새 배열의 끝 인덱스에 추가
    temp[temp.length-1] = newData;

    //4. ☆☆주소값을 이전
    arr = temp;
    temp = null;

  };
    //새로운 데이터를 배열의 맨 끝에 추가
    static int[] arr ={10,20,30};
//    int newData = 40;

  public static void main(String[] args) {

   push(40);

    System.out.println(Arrays.toString(arr));
    //arr가 기존 temp의 주소값을 받으면서
    //원래 temp에 있던 배열이 arr한테 감


  }
}

