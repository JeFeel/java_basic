package day07.inherit;

// 서브 클래스 (자식 클래스)
public class Warrior extends Player{
    //Warrior는 Player+@ 상태가 됨

    int rage; //분노게이지

    public Warrior() {
        this("이름없음");
    }

    public Warrior(String nickName) {
        super(nickName);  //super가 숨어있음!
        this.rage = 20;
    }

    //전사 스킬 : 파워슬래시
    public void powerSlashK(){
        System.out.println("파워슬래시를 시전합니다!");
    }

    //오버라이딩, 메서드 시그니처(void, 메서드명,  parameter 등) 는 건들지 말고 쓰기
    //조건: 부모의 시그니처(리턴타입, 이름, 파라미터) 를 똑같이 사용!!!
    // 접근제한자는 무조건 부모보다 public해야 함
    //부모가 default면 자식은 private할 수는 없다
    @Override //오버라이딩 검사
    public void showStatus(){
        super.showStatus();
        System.out.println("# rage: "+this.rage);
    }

}
