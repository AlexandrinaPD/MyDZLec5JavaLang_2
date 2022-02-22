public class TaskTwoSecVers {
    public static void main(String[] args) {


        // Пункт 1.
        byte b = 127;
        short s = (short) (b + 1);
        int i = (int) (s + 364);
        long l = (long) (i + 18_554_848);

        System.out.println(l);


        // Пункт 2.
        int i1 = 2357;
        double d1 = (double) (i1 + 5151.544);

        System.out.println(d1);

        //Пункт 3.
        short s2 = 1257;
        float f2 = (short) (s2 + 5848.684f);
        double d2 = (double) (f2 + 999.99);

        System.out.println(d2);


        //Пункт 4.
        char c3 = 'd';
        int i3 = (int) (c3 + 368);

        System.out.println(i3);
    }
}
