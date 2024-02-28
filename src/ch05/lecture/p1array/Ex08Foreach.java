package ch05.lecture.p1array;

public class Ex08Foreach {
    public static void main(String[] args) {
        int total = 0;
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        for (int[] sum1 : array) { // for (뽑을 원소 : 뽑을 배열){} -> 배열에서 원소를 뽑는다.
            for (int sum2 : sum1) {
                total += sum2;
            }
        }
        double avg = (double) total / 10; // 2 + 3 + 5
        System.out.println("합계: " + total + " 평균: " + avg);


    }
}
