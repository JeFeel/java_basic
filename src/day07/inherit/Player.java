package day07.inherit;

//수퍼 클래스(부모 클래스) :  객체의 공통 기능과 속성을 설계
public class Player{
        //extends Object

    String nickName;    //캐릭터 이름
    int level;
    int hp;
//    int exp;

    //부모의 생성자
    //alt insert > 항목 선택 > alt n (선택 안 함)

    public Player(String nickName) {
//        super();
        System.out.println("Player의 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        //부모한테 초기화를 떠넘김
    }

    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n======Character's Info=======");
        System.out.println("# name: "+this.nickName);
        System.out.println("# level: "+this.level);
        System.out.println("# hp: "+this.hp);

    }



}
