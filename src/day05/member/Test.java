package day05.member;

public class Test {
    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();

        Member thief = new Member("uuu@eee.com", "3423", "밥도둑", 4, Gender.MALE, 22);

        mr.addMember(thief);
        mr.showMembers();
        
        boolean flag = mr.isDuplicateEmail("uuu@eee.com");
        System.out.println("flag = " + flag);

        //수정 테스트
        String targetEmail = "hhh@qwe.com";
        boolean updateFlag=mr.changePassword(targetEmail, "9999");

        if (updateFlag) {
//            String updateMember = mr.findByEmail(targetEmail).inform();
            Member updateMember = mr.findByEmail(targetEmail);
//            System.out.println("updateMember = " + updateMember);
            System.out.println("updateMember = " + updateMember.password);
        } else{
            System.out.println("이메일이 잘못됨!");
        }

        System.out.println("===============");
        //삭제
        mr.showMembers();
        mr.removeMember(":abc@def.com");
        mr.removeMember(":hhh@qwe.com");
        mr.showMembers();
    }

}
