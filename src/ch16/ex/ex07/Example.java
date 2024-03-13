package ch16.ex.ex07;

public class Example {
    private static int[] scores = {10, 50, 3, 20, 25, 1, 100};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
//        최대값 얻기
        int max = maxOrMin(Math::max);
        System.out.println("최대값: " + max);

        //최소값 얻기
        int min = maxOrMin(Math::min);
        System.out.println("최소값: " + min);
    }
}
