package day10.exception;


import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디와 비밀번호를 입력해주세요!");
        System.out.print("아이디: ");
        String userId = sc.nextLine();
        System.out.print("비밀번호: ");
        String userPw = sc.nextLine();


        LoginUser user = new LoginUser("abc123", "1234");

        try {
//            user.loginValidate("abc124", "1111");
            user.loginValidate(userId, userPw);
            System.out.println("로그인 성공!");
        } catch (LoginValidateException e) {
            // getMessage: 에러원인 메세지를 리턴
            System.out.println(e.getMessage());
        }
    }

}
