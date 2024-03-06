package ch06.p7access;

import org.w3c.dom.ls.LSOutput;

public class C03Encapsulation {
    public static void main(String[] args) {

        C03MyClass obj1 = new C03MyClass();
//        obj1.name = "son";
        obj1.getName();
//        obj1.age = 44;
        obj1.getAge();

//        System.out.println(obj.name);
//        System.out.println(obj.age);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}

class C03MyClass {
    // 필드
    private String name;
    private int age;

    // 메소드
    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


