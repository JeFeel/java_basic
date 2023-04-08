package PraticeMemo;

import quiz2.ArtistRepository;

import static day07.util.Utility.*;

public class PracticeSheet {

    private final static PracticeRepo ar;

    static{
        ar = new PracticeRepo();
    }

    //메인페이지 생성
    public static void startMusic(){

        System.out.println("**** 음악 관리 프로그램 ****");
        System.out.printf("# 현재 등록된 가수: %d명\n",ar.count()); //등록된 가수의 수
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

        if(!ar.isRegistered(artistName)){
            ar.addNewArtist(artistName, songName);
            System.out.printf("\n# %s님이 신규 등록되었습니다\n", artistName );
        } else{
            boolean flag = ar.addNewSong(artistName, songName);
            if(flag){
                System.out.printf("\n# %s님의 노래목록에 %s 곡이 추가되었습니다", artistName, songName);
            }else{
                System.out.printf("\n# [%s] 곡은 이미 등록된 노래입니다.\n", songName);
            }

        }


    }

    private static void searchSong() {

        System.out.printf("\n 검색할 가수명을 입력하세요.");
        String artistName = input("- 가수명");

        if(ar.isRegistered(artistName)){
            System.out.printf("\n# %s님의 노래목록 \n", artistName);
            makeLine();
            String[] songList = ar.getSongList(artistName);
            for (int i = 0; i < songList.length; i++) {
                System.out.printf("* %d. %s\n", i+1, songList[i]);
            }
        }else{
            System.out.println("\n# 해당 가수는 등록되지 않았습니다");
        }
    }
}
