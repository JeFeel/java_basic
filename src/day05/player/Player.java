package day05.player;

public class Player {

    //게임캐릭터 설계

    String nickName; //캐릭터 닉네임

    int level;     //레벨

    int hp;     //체력

    //생성자

//    Player(String inputName){
//        nickName   = inputName;
//        level = 1;
//        hp = 50;
//    };

    public Player() {
        this("이름없음");
        //기본 생성자, 괄호 안에 비어있음
//        System.out.println("1번 생성자 호출!");
//        this.nickName = "이릉없음";
//        this.level = 1;
//        this.hp = 50;
    }

    public Player(String nickName) {
        this(nickName, 1, 50);
//        System.out.println("2번 생성자 호출!");

    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    void levelUp(Player this) {

    }
    //기능 - 메서드
    void attack(Player target){

        if(this==target) return;

        System.out.println("target의 주소: "+ target);
        System.out.println("this의 주소: "+ this);
        //맞은 대상의 체력을 10 감소
        int damage= (int) (Math.random()*6+10);
        target.hp -= damage;


        //전투로그 출력

        //공격 -> 수비 공격해서 10의 피해를 입힘
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘!\n", this.nickName, target.nickName, damage);
    }

}
