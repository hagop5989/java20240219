package inflearn.hard.class1.construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; // this. 을하면 자신의 인스턴스를 가르킴
        this.age = age;
        this.grade = grade;
    }

}
