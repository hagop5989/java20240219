package ch05.lecture.p1array;

public class C01ReferenceType {
    public static void main(String[] args) {
        // 기본타입 (primitive type) 8개 외는 모두 참조타입
        // 배열 : 여러 값을 갖는 타입

        int a;
        a = 3;
        int b;
        b = 3;
        System.out.println(a == b); //true


        int arr[];
        arr = new int[]{3, 4, 5};

        int brr[];
        brr = new int[]{3, 4, 5};

        System.out.println(arr == brr); // false
        //3,4,5가 저장되는 공간 따로, brr 가 저장되는 공간 따로임.
        //arr 와 brr는 같지않다. (3, 4, 5)가 같더라도 다른공간임


    }
}
