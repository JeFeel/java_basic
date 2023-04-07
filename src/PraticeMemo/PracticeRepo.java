package PraticeMemo;


import day04.array.StringList;

public class PracticeRepo {

    //정보 저장을 위해 일단 배열 초기화

    private static Artist[] artistList;

    static {
        artistList = new Artist[0];
    }

    //신규 등록 기능
    public void addNewArtist(String artistName, String songName){
        Artist artist = new Artist();
        artist.setName(artistName);
        artist.setSongList(new StringList());
        artist.getSongList().push(songName);
    }
    //기존 등록자 확인 (중복 확인)
    //

}
