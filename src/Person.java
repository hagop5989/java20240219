public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() { return age; }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public  void introduce() {
        System.out.println("안녕하세요, 제 이름은 "
                + name + " 이고," + age + " 살입니다.");
    }
}

