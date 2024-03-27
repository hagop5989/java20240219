package codingtest;

public class T240313_0 {
    public static void main(String[] args) {
        int numbers_len = 5;
        int[] numbers;
        numbers = new int[numbers_len];
        double avg = 0;
        int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            avg = (double) sum / numbers.length;
    }


}
