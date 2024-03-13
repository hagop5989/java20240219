package ch16.ex.ex06;

public class Example {
    public static double calc(Function fun) {
//        double x = 10;
//        double y = 4;
        return fun.apply(10, 4);
    }

    public static void main(String[] args) {
        double result = calc((x, y) -> (x / y));
        System.out.println("result: " + result);
    }
}


