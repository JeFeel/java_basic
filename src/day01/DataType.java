package day01;

public class DataType {
    public static void main(String[] args) {
         
        
         long money = 21474836470L;  
        
//        100; //메모리에 저장
//        int a; //4바이트 공간 할당 이름을 a부여
//        a=100; //미리 저장된 100을 a에 복사
        
        //실수리터럴은 기본 8byte 할당
        //float 4바이트: 다운캐스팅
        
        float f1 = 1.2345678F;
        System.out.println("f1 = " + f1);

        double d1 = 1.233434563254352345;
        System.out.println("d1 = " + d1);

        boolean TRUE = true;
        //논리타입
        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = TRUE;

        //문자 타입 : 한글자
        char c1 = 'A'; //ascii code 65
        System.out.println((char)(c1+1));

        char c2 = 44032;
        System.out.println("c2 = " + c2);

        //기본타입이 아니라 객체다
        String s = "hello";
    }
}
