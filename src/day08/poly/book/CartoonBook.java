package day08.poly.book;


public class CartoonBook extends Book{

    private int accessAge; //나이 제한

    public CartoonBook() {
    }

//    public CartoonBook(String title, String author, String publisher,) {
//        super(title, author, publisher);
//        this.accessAge= accessAge;
//    }


    public CartoonBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override //부모인 Book클래스의 info 메서드를 재정의해서 사용
    public String info() {
        return String.format("# 분류: 만화책, %s, 연령제한: %d세", super.info(), accessAge);
    }
}
