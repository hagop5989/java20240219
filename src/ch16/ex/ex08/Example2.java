package ch16.ex.ex08;

public class Example2 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    //avg() 메소드 작성
    public static double avg(Function<Student> studentFunction) {
        double sum = 0;
        for (Student student : students) {
            sum += studentFunction.apply(student);
            System.out.println("sum = " + sum);
        }
        return sum / students.length;
    }


    public static void main(String[] args) {

        double englishAvg = avg(Student::getEnglishScore);

        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }

}