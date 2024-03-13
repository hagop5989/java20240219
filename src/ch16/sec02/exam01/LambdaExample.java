package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //함수형 인터페이스의 추상 메소드에 매개변수가 없는 경우, () -> {} 식으로 작성
        //실행문이 두개 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        //실행문이 한 개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("퇴근 합니다."));
    }
}
