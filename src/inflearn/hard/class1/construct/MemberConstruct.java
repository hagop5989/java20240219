package inflearn.hard.class1.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){ // 생성자
        System.out.println("생성자 호출 name= " + name +"age= "+"grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}
