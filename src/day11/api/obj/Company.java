package day11.api.obj;


public class Company {

    String companyName; // 회사명
    String address; //회사 주소

    public Company(String companyName, String address) {
        this.companyName = companyName; //회사명
        this.address = address; //회사주소
    }

    //hashcode 안 나오게 할려면 여기서도  toString 재정의


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
