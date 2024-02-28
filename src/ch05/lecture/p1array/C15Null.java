package ch05.lecture.p1array;

public class C15Null {
    public static void main(String[] args) {
        // 05.null 예제.png
        // null : 참조하는 객체가 없다.

        int[] arr1 = {2, 3, 4};
        System.out.println(System.identityHashCode(arr1));

        int[] arr2 = null; // arr2 참조변수가 참조하는 객체가 없음, 아무것도 존재하지 않음.
        System.out.println(System.identityHashCode(arr2));

        System.out.println(arr1.length);
//        System.out.println(arr2.length);  null의 속성(메소드)를 사용시 오류 발생

        arr1 = null;
        // ↑ ↑ arr1의 값들이 주소값(참조값)을 잃어버려 쓰레기(garbage)가 되어버림, 그리고 자바의 garbage collector가 메모리에서 삭제해버림

        System.out.println(arr1.length); // null의 속성(메소드)를 사용시 오류 발생
    }
}
