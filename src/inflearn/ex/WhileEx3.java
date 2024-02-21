package inflearn.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum0 = 0;
        int sum1 = 0;
        int max = 100;
        int count = 1;
        for (int i = 1; i <= max; i++) {
            sum0 = sum0 + i;
        }
        System.out.println("총합계는 " + sum0);

        while (count <= max) {
            sum1 = sum1 + count;
            count++;
        }
        System.out.println("while문 총합계는" + sum1);
    }
}
