package ch05.lecture.p1array;

public class Ex08 {
    public static void main(String[] args) {

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int total = 0;
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                cnt++;
            }
        }
        total = sum;
        double avg = (double) total / cnt;
        System.out.println(sum);
        System.out.println("합계: " + total + " 평균: " + avg);


    }
}
