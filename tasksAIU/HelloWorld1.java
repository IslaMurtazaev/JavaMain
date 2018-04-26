package tasksAIU;

/**
 * Created by Admin on 1/26/2018.
 */
public class HelloWorld1 {
    static String randomString = "Random String";

    static final double pi = 3.14; // final = const, double = float

    public static void main(String[] args)
    {
        String pi = "Pie!";

        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 123456789;
        long bigLong = 999999999999999999L;
        float bigFloat = 3.14F;
        double bigDouble = 0.99999999999999;
        boolean trueORfalse = true;
        char randomChar = 65; // 'A'

        String mergingTypes = randomChar + " " + Byte.toString(bigByte);
        int converting = (int) bigFloat;
        String intToString = Integer.toString(converting);
        int stringToInt = Integer.parseInt(intToString);

        System.out.println(converting);
//        System.out.println(Double.MAX_VALUE);


    }
}
