package day08.poly.book;


public class Book {

    private String title; //도서명
    private String author; //저자
    private String publisher; //출판사


    //대여상태

    public Book() {}

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //책 정보(제목)를 알려주는 문자열 생성
    public String info(){
        // 문자열 글자수 얻기 length()
        int length = this.title.length();
        String prettier;
        if(length>8) {
            //문자열 슬라이스 substring()
            prettier = this.title.substring(0, 8) + "..."; //0번 이상 8번 미만 인덱스에 뒤는 ...으로 채움
        }else{
            prettier = this.title;
        }
        return  String.format("제목: %s", prettier);
    }


}
