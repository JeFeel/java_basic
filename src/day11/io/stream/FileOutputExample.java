package day11.io.stream;


import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) {

        String msg = "멍멍이는 왈왈\n하하호호";

        //데이터를 외부로 내보낼때 출력스트림
        try (OutputStream fos = new FileOutputStream("C:/exercise/dog.txt");){
            //try 괄호 안에 넣으면 close까지 자동으로 해줌

            fos.write(msg.getBytes());
            System.out.println("파일 저장 성공!");


        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리 실패");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("출력 시스템에 이상이 생겼습니다");
            e.printStackTrace();
        }


        /*finally {
            try {
                if (fos != null) fos.close();
                //close에도 예외처리 해야됨
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }


}
