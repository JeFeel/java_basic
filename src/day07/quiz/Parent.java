package day07.quiz;


public class Parent {
//    //8번문제
//    public String name;
//    public Parent(String name) {
//        this.name = name;
//    }

    //9번문제
    public String nation;
    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");  //2번
    }
    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String) call");  //1번
    }
}
