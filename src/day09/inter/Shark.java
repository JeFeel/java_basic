package day09.inter;


public class Shark  extends Animal implements BadAnimal{

    @Override
    public void hunt() {
        System.out.println("상어 크아앙");
    }

    @Override
    public void violent() {
        System.out.println("상어한테 물렸다");
    }
}
