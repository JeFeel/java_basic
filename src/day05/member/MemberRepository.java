package day05.member;

import java.time.LocalDate;

//역할: 회원 저장소 역할
public class MemberRepository {

    public static final int NOT_FOUND = -1;

    //가입된 회원 배열

    Member[] memberList;  //깡통 상태의 배열

    //삭제된 회원 배열
    Member[] removeMembers;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member("abc@def.com", "1234", "콩벌레", 1, Gender.MALE, 50);
        memberList[1] = new Member("xxx@zzz.com", "9999", "팥죽이", 2, Gender.FEMALE, 30);
        memberList[2] = new Member("hhh@qwe.com", "5678", "카레왕", 3, Gender.FEMALE, 44);
    }

    /*모든 회원 정보를 출력해주는 기능*/
    void showMembers() {
        System.out.printf("==========현재 회원정보 (총 %d명)==========\n", memberList.length);
        for (Member m : memberList) {
            System.out.println(m.inform());
        }
    }

    /**
     * 회원 가입 기능
     *
     * @param1 - newMember: 새롭게 회원가입하는 회원의 정보
     * @return: 회원가입 성공 여부
     * 성공시 true, 이메일이 중복되어서 실패시 false
     */
    boolean addMember(Member newMember) {

        //이메일이 중복인가?
        if (isDuplicateEmail(newMember.email)) {
            return false;
            //이메일 중복이니 가입을 막음
        }

        //실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }


        //회원가입 시간 등록
        newMember.regDate = LocalDate.now();


        temp[temp.length - 1] = newMember;
        memberList = temp;


        //가입 성공
        return true;
    }

    /**
     * 이메일의 중복여부를 확인하는 기능
     *
     * @return : 중복되었을 시 true, 사용가능할 시 false
     * @param1 targetEmail : 검사 대상 이메일
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        //중복이 안 됐음
        return false;
    }

    //마지막 회원의 번호를 알려주는 기능
    int getLastMemberId() {

        return !isEmpty() ? memberList[memberList.length - 1].memberId : 0;
    }

    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @return : 찾은 회원의 객체정보, 못찾으면 null반환
     * @param1 email: 찾고 싶은 회원의 이메일
     */

    Member findByEmail(String email) {

        for (Member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }

    /**
     * 이메일을 통해 저장된 회원의 인덱스값을 알아내는 메서드
     *
     * @param email - 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1 리턴
     */


    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email))
                return i;
        }
        return NOT_FOUND;
    }

    /**
     * 비밀번호 수정하는 기능
     *
     * @param email:      수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */

    boolean changePassword(String email, String newPassword) {

        //인덱스 탐색
        int index = findIndexByEmail(email);

        //수정진행
        if (index == NOT_FOUND) return false;

        memberList[index].password = newPassword;
        return true;
    }

    void removeMember(String email) {
        //인덱스 찾기
        int delIndex = findIndexByEmail(email);

        //앞으로 땡기기
        for (int i = delIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];

        }
        //배열 마지막 칸 없애기
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;

    }

    //멤버가 비었는지 확인

    boolean isEmpty() {
        return memberList.length == 0;

    }
}
