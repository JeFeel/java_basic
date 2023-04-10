package day10.collection.song;




import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {

        //세이브파일 자동로드
        ArtistRepository.loadFile();
        ArtistView.startMusic();

        Stack<Object> objects = new Stack<>();
        Queue<Object> queue = new LinkedList<>();

    }
}
