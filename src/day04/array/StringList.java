package day04.array;


//스트링배열을 제어하는 설계도

import java.util.Arrays;

public class StringList {

    //필드
    String[] sArr;

    //생성자
    StringList(){
        sArr = new String[0];
    }

    StringList(String...initData){
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }

    //메서드
    //배열에 저장된 데이터 수를 알려주는 기능
    int size(){
        return sArr.length;
    }

    //배열의 맨 끝에 데이터를 추가하는 기능
    void push(String newData){
        String[]temp = new String[sArr.length+1];

        for (int i = 0; i < sArr.length; i++) {
            temp[i]=sArr[i];

        }
        temp[temp.length-1] = newData;
        sArr = temp;
        //지역변수니까 temp는 알아서 없어짐
    }

    //배열의 맨 끝 데이터 삭제하는 기능
    String pop(){
        String deleteTarget = sArr[sArr.length-1];

        String[]temp= new String[sArr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return deleteTarget;
    }
    //배열 내부데이터 출력
    public String toString(){
        return Arrays.toString(sArr);
    }

    //배열이 비었는지 확인
    boolean isEmpty(){
        return sArr.length ==0;
    }

    //배열 데이터 전체삭제
    void clear(){
        sArr = new String[0];
    }

    //인덱스 탐색 (indexOf)
    int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }
    //자료 유무 확인 (includes)
    boolean includes(String target) {
        return indexOf(target) != -1;
    }
    //중간 삭제 (remove)
    String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop(); //코드 재활용
        return targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    String remove(String target) {
        return remove(indexOf(target)); //코드 재활용
    }
    //중간 삽입 (insert)
    void insert(int index, String newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length - 1) push(newData);

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }

}
