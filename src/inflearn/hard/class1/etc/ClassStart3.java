package inflearn.hard.class1.etc;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        //실제 학생 메모리르 만들었음

        student1.name = "학생1";
        //Class 내에 만들어 놓은 것은 '.' 점을 통해 접근 가능하다.
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이 " + student1.age + " 성적 " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이 " + student2.age + " 성적 " + student2.grade);
    }
}
