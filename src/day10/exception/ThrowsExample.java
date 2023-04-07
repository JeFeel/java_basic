package day10.exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {


    //정수를 입력받아서 리턴하는 메서드
    public int inputNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    //문자열을 정수로 변환하는 기능
    public int convert(String s) throws NumberFormatException{
        int n = Integer.parseInt(s);
        return n;
    }

    public void convertAndInput(){
        //여기서 한번에 try catch 거는 편이 효율적임 --> 각각에 throws (던져주다, 떠넘기다) 추가

        try {
            int n = inputNumber();
            int m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수 입력 요망");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 불가");
        }

    }
}
