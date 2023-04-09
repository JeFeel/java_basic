package day10.exception;


import java.util.Scanner;

public class PracException {

    public static void main(String[] args) {


        System.out.println("예외처리 연습해보기");

        Scanner sc = new Scanner(System.in);
        System.out.print("정수1: ");
        int n1 = sc.nextInt();
        System.out.print("정수2: ");
        int n2 = sc.nextInt();

        System.out.printf("덧셈: %d\n", n1+n2);
        System.out.printf("뺄셈: %d\n", n1-n2);
        System.out.printf("곱셈: %d\n", n1*n2);
        try {  //ctrl alt t >> 6
            System.out.printf("나눗셈: %d\n", n1/n2);
        } catch (Exception e) {
            System.out.println("숫자는 0으로 나눌 수 없습니다!");
            e.printStackTrace();
        }
    }
}
