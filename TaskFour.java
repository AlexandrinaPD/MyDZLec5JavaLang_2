public class TaskFour {

    public static void main(String[] args) {

        // Первый вариант
        byte b = 127;
        System.out.println(++b);


        // Второй вариант
        byte b2 = 127;
        byte b3 = (byte) (++b2);
        System.out.println(b3);

    }
    }