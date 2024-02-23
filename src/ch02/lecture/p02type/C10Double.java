package ch02.lecture.p02type;

public class C10Double {
    public static void main(String[] args) {
        //double(float)은 근사 값으로 저장됨
        double a = 0.1;
        double b = 0.2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //연산 시 원하지 않는 값이 나올 수 있음.
        double c = a + b;
        System.out.println("c = " + c);

        //BigDecimal 사용해서 문제 해결
//        BigDecimal d = new BigDecimal(BigInteger.valueOf("0.1") ;
//        BigDecimal e = new BigDecimal(BigInteger.valueOf("0.2"));
//
//        BigDecimal f = d.add(e);
//        System.out.println("f = " + f);


    }
}
