package day09.inter;


public class Duck extends Animal implements Pet{

    @Override
    public void eat() {
        System.out.println("오리 꽥꽥");
    }

}
