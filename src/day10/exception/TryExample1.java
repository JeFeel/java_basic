package day10.exception;


public class TryExample1 {

    public static void main(String[] args) {

        //프로그램의 오류로 인한 튕김을 방지하려면
        //예외처리를 통해 막아야함

//        int n1=10, n2=5;
        int n1=10, n2=0; //산술 예외

        System.out.println("나눗셈 시작!");

        try {
            //예외 발생 가능성이 있는 코드 <- 예외처리
            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (Exception e) { //예외가 발생하면 처리할 코드
            System.out.println("0으로 나눌 수 없습니다!");
            //개발시에 쓰는 코드 (로그 트레이싱)
            e.printStackTrace(); //에러 원인을 로그로 남겨줌
        }

        System.out.println("프로그램 정상 종료");
    }


}
