package ch07.exercise.p4;

import inflearn.hard.class1.poly.basic.Parent;

public class Exercise04 {
    public static void main(String[] args) {
    }

}

class Parents {
    public void method1(int a) {

    }

    public void method2() {
    }
}

class Child extends Parents {
    @Override
    public void method1(int a) {
        super.method1(a);


    }
}
