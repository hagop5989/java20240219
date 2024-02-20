package sec02;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;

        char c3 = '가';
        char c4 = 44032;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        int c5 = 0x1F680;
        char[] emojit = Character.toChars(c5);
        String emoji = new String(emojit);
        System.out.println("c5 = " + emoji);


    }
}
