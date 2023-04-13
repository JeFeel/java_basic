package day13.comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("송철수", 15, 79)
                        , new Student("박영희", 17, 41)
                        , new Student("손흥민", 11, 11)
                        , new Student("감우성", 25, 34)
                )
        );

        //나이 순으로 오름차 정렬 (나이 적은순)
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        //이름 가나다순으로 오름차정렬
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        studentList.forEach(s -> System.out.println(s));


    }


}
