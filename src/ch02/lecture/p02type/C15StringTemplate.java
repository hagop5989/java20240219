package ch02.lecture.p02type;

import static java.lang.StringTemplate.STR;

public class C15StringTemplate {
    public static void main(String[] args) {
        // java 21 부터 사용가능
        // String template

        String name = "jane";
        String age = "30";

        // my name is jane and age is 30

        String desc = "my name is " + name + " and age is " + age;
        System.out.println(desc);

        String desc2 = String.format("my name is %s and age is %s", name, age);

        String desc3 = STR."my name is \{name} and age is \{age}";


        String country = "스위스";
        String address = "베른";
        // 저는 한국에 있는 서울에 삽니다.
        String desc4 = STR."저는 \{country}에 있는 \{address}에 삽니다.";
        System.out.println(desc4);
    }
}
