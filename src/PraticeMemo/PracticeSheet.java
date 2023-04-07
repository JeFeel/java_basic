package PraticeMemo;

import quiz2.ArtistRepository;

import static day07.util.Utility.*;

public class PracticeSheet {

    private final static ArtistRepository ar;

    static{
        ar = new ArtistRepository();
    }

    //메인페이지 생성
    public static void startMusic(){

        System.out.println("**** 음악 관리 프로그램 ****");
        System.out.printf("# 현재 등록된 가수: %d명\n",count); //등록된 가수의 수
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");

        makeLine();

        chooseMenu();


    }

    private static void chooseMenu() {
        String menu = input(">>>");
        switch(menu){
            case "1":   //노래 등록하기
                registerSong();
                break;
            case "2":   //노래 정보 검색
                searchSong();
                break;
            case "3":   //프로그램 종료
                System.out.println("# 프로그램을 종료합니다");
                System.exit(0);
                break;
            default:


        }
    }

    private static void registerSong() {
        System.out.println("# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명: ");
        String songName = input("- 곡명: ");

        if()


    }

    private static void searchSong() {

    }
}
