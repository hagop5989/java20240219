package ch04.lecture.p1if.sec02.sec07;

public class Ex04 {
    public static void main(String[] args) {

        int dice1 = 0;
        int dice2 = 0;

        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{dice1},\{dice2})");
            System.out.println("-------------");
        } while ((dice1 + dice2) != 5);
    }
}
