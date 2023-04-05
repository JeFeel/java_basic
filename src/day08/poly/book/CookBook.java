package day08.poly.book;


public class CookBook extends Book{

    private boolean coupon; //요리학원 쿠폰유무

    public CookBook() {}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override //부모인 Book클래스의 info 메서드를 재정의해서 사용
    public String info() {
        return String.format("# 분류: 요리책, %s, 쿠폰유무: %s", super.info(), this.coupon ? "있음":"없음");

        //String.format과 printf(PrintWriter의 메서드) 의 차이는 출력여부!
    }
}
