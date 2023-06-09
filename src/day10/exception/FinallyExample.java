package day10.exception;


public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "앵무새"};

        for (int i = 0; i < pets.length+1; i++) {
            try {
                System.out.println(pets[i]+" 키울래요~");
            } catch (Exception e) {
                System.out.println("애완동물이 더 없습니다");
                e.printStackTrace();
                // ArrayIndexOutOfBoundsException
            } finally {
                // 예외와 관계없이 항상 실행할 코드
                System.out.println("애완동물 조아용!");

                //데이터베이스 접속 후 다음 접속을 위해
                //데이터베이스 연결을 종료시켜야 할 경우
            }
        }

        System.out.println("프로그램 정상 종료");
    }
}
