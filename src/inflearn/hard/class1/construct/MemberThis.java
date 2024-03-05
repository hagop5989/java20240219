package inflearn.hard.class1.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 이런경우는 nameField 앞에 this. 가 생략되어있다고 봄
    }
}
