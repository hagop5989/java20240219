public class Main0 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        System.out.println("이름 :" + person.getName());
        System.out.println("나이 :" + person.getAge());

        person.setName("Bob");
        person.setAge(30);

        System.out.println("변경된 이름 :" + person.getName());
        System.out.println("변경된 나이 :" + person.getAge());

        person.introduce();
    }
}
