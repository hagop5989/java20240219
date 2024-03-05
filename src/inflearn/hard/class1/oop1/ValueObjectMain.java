package inflearn.hard.class1.oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        //ValueData 의 필드도 사용가능하지만 메서드도 사용 가능하다.

        System.out.println("최종 숫자= " + valueData.value);

    }


}
