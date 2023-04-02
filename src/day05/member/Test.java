package day05.member;

public class Test {
    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();

        Member thief = new Member("uuu@eee.com", "3423", "밥도둑", 4, Gender.MALE, 22);

        mr.addMember(thief);
        mr.showMembers();
        
        boolean flag = mr.isDuplicateEmail("uuu@eee.com");
        System.out.println("flag = " + flag);
    }

}
