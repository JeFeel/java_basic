package day09.abs;

//추상화 (abstract)
// 1. 객체 생성 불가
// 2.메서드는 오버라이딩을 위한 껍데기역할에 국한되도록 제한
public abstract class Pet { //추상 클래스

    private String name;    //이름
    private String kind;    //견종
    private int age;    //나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //오버라이딩을 위한 메서드 껍데기 만들기
    //클래스가 추상이 아니면 추상 메서드 선언 불가
    //블록을 못 만듦

    //필수 기능 (안 만들면 에러남)
    public abstract void takeNap();

    public abstract void eat();

    //선택 기능
    public void walk() {
        System.out.println("애완동물은 산책을 합니다.");
    }
}

