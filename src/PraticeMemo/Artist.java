package PraticeMemo;


import day04.array.StringList;

//생성자, getter,setter
public class Artist {

    private String name;
    private StringList songList;

    public Artist(String name, StringList songList) {
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

    public StringList getSongList() {
        return songList;
    }

    public void setSongList(StringList songList) {
        this.songList = songList;
    }

}
