package day04;

//댄서의 설계도
//설계도에는 main을 만들지 않는다
//main의 용도는 실행!

public class Dancer {
    //속성 (필드)
    //이건 변수가 아니라 필드임
    //자바에서 지역변수만 변수
    String dancerName; //댄서 이름

    String crewName;  //크루 이름

    String genre; //춤 장르

//    int level;  //춤 수준(0: 초보자, 1: 중수, 2: 고수)
    DanceLevel level;  //춤 수준(0: 초보자, 1: 중수, 2: 고수)


    //생성자: 스카우터, 개발자(공돌이)
    //생성자도 함수개념, 리턴타입이 void로 고정
    //리턴값은 생성한 객체의 주소값을 리턴

    Dancer(){
        dancerName = "갑돌이";
        crewName = "돌아이들";
        genre = "아이돌댄스";
        level = DanceLevel.AMATUER;
    }
    //생성자 오버로딩
    Dancer(String dgenre){
        dancerName = "관종킹";
        crewName = "써커스왕";
        genre = dgenre;
        level = DanceLevel.BEGINNER;
    }
    Dancer(String dName, String dGenre, DanceLevel dLevel){
        dancerName =dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;
    }
    //기능 (메서드) : static을 붙이지 마세요
    //춤추는 기능
    void dance() {
        System.out.println(genre+"춤을 열정적으로 춥니다.");
    }

    //스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다");
    }

    //자기소개 기능
    String introduce() {
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
    }

}
