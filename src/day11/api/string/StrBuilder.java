package day11.api.string;


public class StrBuilder {

    private static void makeString() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 500000; i++) {
            s+= "A";

        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요 시간: "+(end - start)+"밀리초");
    }

    private static void makeStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 500000; i++) {
            s.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링빌더 총 소요 시간: "+(end - start)+"밀리초");
    }


    public static void main(String[] args) {

        makeStringBuilder();
        makeString();

        Integer a = 10; //오토 박싱
        Character c = 'A';
        Byte b = 1;
        Double d = 11.1;

        //대문자의 차이: 기본값이 달라짐
        // Integer 기본값: null
        // int 기본값: 0


    }


}
