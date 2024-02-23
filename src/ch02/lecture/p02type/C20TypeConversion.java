package ch02.lecture.p02type;

public class C20TypeConversion {
    public static void main(String[] args) {
        // 정수형 : byte(1), short(2) int(4), long(8)
        // 실수형 : float(4), double(8)
        // 작은 크기의 타입의 값을 큰크기의 타입의 변수에 할당 가능함.
        // 반대는 안됨

        byte a = 23;
        int b = a;
        short c = a;
        long d = a;

        short e = 1241;
        int f = e;
        long g = e;
//        byte h = e; // X
        int i = 300;
        long j = i;
//        short k = i; // x

        float l = 3.14F;
        double m = l;

        double n = 3.14;
//        float o = n; //x
    }

}
