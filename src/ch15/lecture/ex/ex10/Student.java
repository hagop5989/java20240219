package ch15.lecture.ex.ex10;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    ///입력
    @Override
    public int compareTo(Student o) {
        return score - o.score;
    }
}
