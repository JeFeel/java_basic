package day08.poly.book;

//도서관리 시스템 데이터 처리

import day04.array.StringList;

import static day08.poly.book.RentStatus.*;

public class LibraryRepository {


    //회원 1명일 경우 상정
    private static BookUser bookUser;

    //도서정보
    private static Book[] bookList;

    static {
        bookList = new Book[]{
                new CookBook("기적의 집밥책", "김혜진", "청림라이프", true),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("떨어지면 끝장", "스에노부 케이코", "대원씨아이", 18),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CartoonBook("나미야 잡화점의 기적", "히가시노 게이고", "현대문학", 7)
        };
    }
    //유저 등록 기능
    void register(BookUser userInfo){
        bookUser = userInfo;
    }

    //마이페이지 기능
    /*여기에 있는 bookUser 정보 리턴*/

    BookUser findBookUser(){
        return bookUser;
    }

    //모든 책의 정보를 알려주는 메서드
    public String[] getBookInfoList(){
        String[] infoList = new String[bookList.length]; //6

        for (int i = 0; i < infoList.length; i++) {
            infoList[i]=bookList[i].info();
        }
        return infoList;
    }

    //검색어를 받으면 해당 검색어를 포함하는 제목을 가진
    //책 정보들을 반환
    public String[] searchBookInfoList(String keyword){
        StringList list = new StringList();
        //bookList을 탐색
        for (Book book : bookList) {
            String title = book.getTitle(); //책 제목
            if(title.contains(keyword)){
                //검색어에 걸린 책 정보문자열
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }

    //저자이름을 입력하면 해당 검색어를 가진 책 정보 반환
    public String[] searchBookAuthorList(String authorName){
        StringList list = new StringList();
        for (Book book : bookList) {
            String author = book.getAuthor();
            if(author.contains(authorName)){
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }

    //도서 대여 처리
    public RentStatus rentBook(int rentNum){
        //대여를 원하는 책 추출
        Book wishBook = bookList[rentNum-1];
        //책의 분류에 따라 다른 처리
        if(wishBook instanceof CookBook){
            CookBook cookBook = (CookBook) wishBook;
            //쿠폰 유무를 확인
            if(cookBook.isCoupon()){
                bookUser.setCouponCount(bookUser.getCouponCount()+1);
                return RENT_SUCCESS_WITH_COUPON;
            }else{
                return RENT_SUCCESS;
            }
        }else if(wishBook instanceof CartoonBook){
            CartoonBook cartoonBook  = (CartoonBook) wishBook;
                //연령제한을 확인
            if(bookUser.getAge() >= cartoonBook.getAccessAge()){
                //빌릴 수 있는 경우
                return  RENT_SUCCESS;
            }else{
                return RENT_FAIL;
            }
        }
        return RENT_FAIL;
    }

}
