package inflearn.hard.class1.static2.ex;

public class MathArrayUtils {
    static int[] values;

    private MathArrayUtils() {
    }

    public static int sum(int[] values){
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values)/ values.length;
    }

    public static int min(int[] values) {
        int min = values[1]; // 이미 0번째 순번이 담겨있기에 1부터 비교.
        for (int value : values) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[1];
        for (int value : values) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }


}
