package day10.exception;


public class LoginValidateException extends RuntimeException{
    //존재하지 않는 에러를 인식시켜서 multi catch할려면 사용자가 직접 만들어야함
    // <사용자 정의 에러클래스>
    //에러 처리하는 클래스

    //관례상 접미어는 Exception을 씀
    //실무에서 RuntimeException을 많이 상속받음

    //기본생성자
    public LoginValidateException() {
    }

    //에러메세지 받는 생성자
    public LoginValidateException(String message) {
        super(message);
    }

    public LoginValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginValidateException(Throwable cause) {
        super(cause);
    }

    public LoginValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }




}
