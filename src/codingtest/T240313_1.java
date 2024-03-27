package codingtest;

import java.util.Arrays;

public class T240313_1 {
    public static void main(String[] args) {


    int numbers[] = new int[3];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    System.out.println(Arrays.toString(numbers));
    String direction = "left";
        System.out.println(numbers.length);

    if(direction.equals("left")){
        for (int i=0; i< numbers.length; i++) {
            if(i == 0) {
                numbers[numbers.length-1] = numbers[0];
            } else
            numbers[i-1] = numbers[i];
        }
    }
            System.out.println(Arrays.toString(numbers));

    }
}
