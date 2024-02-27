package inflearn.hard.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        //실제 학생 메모리르 만들었음

        student1.name = "학생1";
        //Class 내에 만들어 놓은 것은 '.' 점을 통해 접근 가능하다.
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이 " + students[0].age + " 성적 " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이 " + students[1].age + " 성적 " + students[1].grade);
    }
}
