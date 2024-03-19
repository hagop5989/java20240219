package ch15.lecture.ex.ex08;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    //여기에 코드 작성

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}
