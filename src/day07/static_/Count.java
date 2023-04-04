package day07.static_;


public class Count {

    //제한자 (modifier)
    //접근 제한자(Access), 사용 제한자(Usage)

    public static int x; //정적 필드   --> 모든 객체가 공유  (메모리가 하나)

    public int y; //인스턴스 필드 (동적)  --> 객체별로 관리  (메모리 수에 변동)

    //static method
    public static void m1(Count c4){
        System.out.println("static 메서드 호출!");
        //필드 참조 (static 메서드 안에서는 static 필드만 참조가능)
        //static은 this 정보를 알 수 없어서 호출불가능

        System.out.println("x= "+x);

//        System.out.println("y= "+y); //참조 불가

        Count c3 = new Count();
        System.out.println("c3.y="+c3.y); //c3의 y라고 명시했기 때문에 참조 가능
        System.out.println("c4.y="+c4.y);

    }

    //instance method
    public void m2(){
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x= "+x);
        System.out.println("y= "+this.y);

    }




}
