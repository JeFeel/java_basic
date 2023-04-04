package day07.quiz;




public class Child extends Parent{
    //8번 문제
//    public Child(String name) {
//        super(name); //이렇게 컴파일 에러 해결
//        this.name = name;
//    }

    //9번문제
    private String name;
    public Child() {
        this("홍길동");
        System.out.println("Child() call");  //4번
    }
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String) call");   //3번
    }
}
