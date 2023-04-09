package PraticeMemo;


import day04.array.StringList;

public class PracticeRepo {

    //정보 저장을 위해 일단 배열 초기화

    private static Artist[] artistList;

    static {
        artistList = new Artist[0];
    }
    //==============================================================================
    //배열에 등록된 가수의 수 반환
    public int count(){
        return artistList.length;
    }

    //==============================================================================
    //신규 등록 기능
    public void addNewArtist(String artistName, String songName){
//        Artist artist = new Artist();  신규 가수 객체 생성
//        artist.setName(artistName);  가수 객체에 이름 셋팅
//        artist.setSongList(new StringList());  가수 객체에 노래 "목록"을 셋팅
//        artist.getSongList().push(songName);  노래 목록에 노래를 추가

        //한 줄 요약
        Artist artist = new Artist(artistName, new StringList(songName));

        //위 정보를 한데묶어 가수 배열에 추가
        Artist[] temp = new Artist[artistList.length+1];
        for (int i = 0; i < artistList.length; i++) {
            temp[i] = artistList[i];
        }
        temp[temp.length - 1] = artist;
        artistList = temp;
    }
    //==============================================================================

    //기존 등록자 확인 (중복 확인)
    public boolean isRegistered(String artistName){
        return findArtistByName(artistName) != null;
    }

    private Artist findArtistByName(String artistName) {
        for (Artist artist : artistList) {
            if(artistName.equals(artist.getName()))
                return artist;
        }
        return null;
    }

    //==============================================================================
    //새 노래 추가
    public boolean addNewSong(String artistName, String songName){
        Artist foundArtist = findArtistByName(artistName); //가수 먼저 불러오기
        StringList songList = foundArtist.getSongList(); //불러온 가수에서 노래목록 빼오기
        if(!songList.includes(songName)){  //노래를 포함하고 있지 않으면
            songList.push(songName);
            return true;
        }
        return false;
    }
    //==============================================================================
    //특정 가수의 노래목록 반환
    public String[] getSongList(String artistName){
        return findArtistByName(artistName).getSongList().getsArr();
    }




}
