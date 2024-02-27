package inflearn.java_basic.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count0 = 1;
        int count1 = 1;
        int endNum = 10;
        while (count0 <= endNum) {
            System.out.println(count0);
            count0++;
        }

        for (int i = 1; i <= endNum; i++) {
            System.out.println(count1);
            count1++;
        }
    }

}
