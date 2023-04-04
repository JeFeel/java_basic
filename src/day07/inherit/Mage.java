package day07.inherit;


public class Mage extends Player{

    int mana; //마력 게이지

    public Mage(String nickName) {
        super(nickName);  //super가 숨어있음!
        this.mana = 100;
    }


    //썬더볼트
    public void thunderBolt(){

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: "+this.mana);
    }
}
