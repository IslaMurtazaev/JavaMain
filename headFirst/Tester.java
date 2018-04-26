package headFirst;

import java.util.Date;

public class Tester {

    public static void main(String[] args) {

//        System.out.println(TryToReturnByte());

//        int n = 10;
//        System.out.println(n = (n > 5)? n : 5);

//        int x = 127;
//        byte y = (byte) x; // CASTING (a smaller type can't be assigned to a bigger on without casting)
//        int z = y; // a bigger type can be assigned directly to the smaller type
//        System.out.println(x+", "+y+" and "+z);
//        int tooBig = 42000;
//        short tooSmall = (short) tooBig; // fucked up shit happens (when you exceed the bits of current type)
//        System.out.println(tooSmall);
//        float pi = 3.14f;
//        int piInt = (int) pi;
//        System.out.println(piInt);


//        int x = 2;
//        byte y = 2;
//        if(x == y){ // == operator looks at bits equality || they refer to the same object on the heap
//            // equals() method cares if tep different objects are equal
//            System.out.println("Their bits pattern is the same");
//        }

//        int x = 0;
//        int a = x++; // a is 0 (POST INCREMENT)
//        // first assign the value of x and then increment it
//
//        x = 0;
//        int b = ++x; // b is 1 (PRE INCREMENT)
//        // first increment the value of x and then assign it

//        System.out.println("a is "+a+" while b is "+b);


//        int[] arr = {1,2,3,3,2,1};
//        Set<Integer> set = new HashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
//        String[] result = new String[set.size()];
//        set.toArray(result);
//        Arrays.sort(result);
//        System.out.println(set);


//        int i = 2;
//        Integer iWrapped = new Integer(i); // Wrapping primitive type in Object (explicitly works in ArrayLists and Hashmaps)
//
////        int unWrapped = iWrapped.intValue();
//        int x = iWrapped;
//        System.out.println(x);


//        System.out.printf("I have %,.2f bugs to fix!\n", 48234.0987);
        String s = String.format("%,d", 1000000000);
        //TODO % [argument number] [flags] [width] [.precision] type
        String e = String.format("%,6f", 42.0);
        String c = String.format("%.2f", Double.valueOf(e));

        String pair = String.format("You got %.1f out of %d points", 98.78431, 100);
//        System.out.println(pair);


    }

//    public static int TryToReturnByte(){
//        byte myByte = 12;
//        return myByte;
//    }

}
