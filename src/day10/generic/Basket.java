package day10.generic;


public class Basket<F> {

    //모든 과일 담기
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    //한 글자로 두면 나중에 타입을 정하겠다는 뜻
}
