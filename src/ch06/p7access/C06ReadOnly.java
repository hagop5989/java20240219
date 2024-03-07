package ch06.p7access;

public class C06ReadOnly {
    public static void main(String[] args) {
        C06Myclass1 o1 = new C06Myclass1("son", 33);
        System.out.println("o1.getName = " + o1.getName());
        System.out.println("o1.getAge = " + o1.getAge());
        System.out.println();
        // record  - 위와 같은 패턴을 아예 만들어 놓자 (14 버전이후, 아직은 대중화 안됨, 앞으로 쓰일 것)

        C06MyClass2 o2 = new C06MyClass2("lee", 22);
        System.out.println("o2.name() =" + o2.name());
        System.out.println("o2.age() = " + o2.age());
    }
}

record C06MyClass2(
        //넣어야하는 필드들 적기
        String name,
        int age
) {

}

class C06Myclass1 {
    private String name;
    private int age;
    // 객체 만들어질때 세팅하자 - 생성자로 값 받게 함.
    // 만든 후 외부에서 못건드리게 private

    public C06Myclass1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
