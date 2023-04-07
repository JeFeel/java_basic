package day10.exception;


public class UserMain {

    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc123", "1234");
        try {
            user.loginValidate("abc124", "1111");
        } catch (Exception e) {
            // getMessage: 에러원인 메세지를 리턴
            System.out.println(e.getMessage());
        }
    }

}
