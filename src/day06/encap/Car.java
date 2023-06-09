package day06.encap;

public class Car {
    private String model; //모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드 (D,N,R,P)
    boolean start;  //시동 온오프 상태

    //생성자 : 객체가 처음 생성될 때 상태
    public Car(String model){
        this.model = model;
        this.mode = 'P';
    }

    // setter: 필드값을 제어하기 위한 메서드
    public void setSpeed(int speed){
        if(speed<0||speed>200) return; //디폴트값인 0을 반환
        this.speed = speed;
    }
    //getter: 필드값을 참조하기 위한 메서드
    public int getSpeed(){
        //필드에는 km로 저장되어 있는데 mile 변환해서 줘야함
        return this.speed; //mile 단위변환에 맞게 수식 적어서 리턴할 수 있음
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode){
            case 'D': case 'R': case 'N': case 'P':
                this.mode=mode;
                break;
            default:
                this.mode = 'P';
        }
    }

    public boolean isStart() {
        return start;
    }
    //boolean 타입의 getter는 예외적으로 앞에 get 대신에 is가 붙음 (관례?)

    public void setStart(boolean start) {
        this.start = start;
    }

    //====================================================================

    //엔진에 연료가 주입되는 기능
    private void inject(){
        System.out.println("연료가 주입됩니다.");
    }
    //엔진오일이 순환하는 기능
    private void putOil(){
        System.out.println("엔진오일이 순환합니다.");
    }
    //엔진 실린더가 움직이는 기능
    private void moveCylinder(){
        if (start) {
            System.out.println("실린더가 움직입니다.");
        }else{
            System.out.println("차가 폭발합니다.");
        }
    }
    //시동버튼을 누르는 기능
    public void pressButton(){
        //자동차의 작동방식
        //흡입 >> 압축 >>  폭발(점화) >> 배기
        this.start = true;
        inject();
        putOil();
        moveCylinder();
        //pressButton이라는 캡슐 안에
        //순서를 내부적으로 정해줌 (외부에서 변경 못하게)
        System.out.println("시동이 걸렸습니다.");
    }

    //pressButton만 public으로 만들고 나머지를 private으로 돌림
    //캡슐화! (하나의 목적을 위해 관련 있는 코드들을 한데 묶기
}
