package c02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        // 주석
        // 한줄주식
        // ctrl + /
        /* 여러줄 주석 */

        // 변수 : Variable
        // 값을 저장하는 공간의 이름

        // 변수 선언 : 저장 공간을 만듦
        // 방법 -> 타입명 변수명

        System.out.println("프로그램 시작");
        int a; // int 타입의 저장공간. 공간이름은 a

        // 변수에 값 저장 (assignment, 할당, 대입)
        // 변수명 = 값
        a = 10;

        System.out.println("a는 "+ a + " 입니다.");

        a = 9;

        int b = 100;

        int c;
        int C;
        int $;
        int _c;


        System.out.println("b는 " + b + " 입니다.");

        // 변수명에 사용할 수 있는 문자들
        // 영문 대소문자, 숫자 , $ , _
        // 숫자로 시작할 수 없다.
        // _로만 작성할 수 없음.
        // ↑ [법칙]

        // 변수명 작성 [관습]
        // 소문자로 시작
        // 여러단어의 조합이면 각 단어의 앞글자만 대문자
        //  ㄴ> lowerCamelCase

        int age;
        int ageOfJames;
        int address;
        int addressOfJane; // 관습 ok
        int address_of_jane; //관습 x

//        int age; // 같은 변수명을 다시 선언할 수 없음.
        // 자바의 키워드(예약어)는 변수명으로 사용할 수 없음.

//        int package;
//        int void;
//        int float;







    }
}
