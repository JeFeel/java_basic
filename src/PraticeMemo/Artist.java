package PraticeMemo;


import day04.array.StringList;

//생성자, getter,setter
public class Artist {

    private String name;
    private String songList;

    public Artist(String name, String songList) {
        this.name = name;
        this.songList = songList;
    }

    public Artist() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSongList() {
        return songList;
    }

    public void setSongList(String songList) {
        this.songList = songList;
    }

    public void setSongList(StringList stringList) {
        this.songList = songList;
    }
}
