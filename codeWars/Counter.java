package codeWars;

public class Counter {

    public static void main(String[] args) {

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  null,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        Counter c = new Counter();
        System.out.println(c.countSheeps(array1));

    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sum = 0;
        for (int sheep = 0; sheep < arrayOfSheeps.length; sheep++){
            if (arrayOfSheeps[sheep] == null){continue;}
            if (arrayOfSheeps[sheep]){sum++;}
        }
        return sum;
    }
}