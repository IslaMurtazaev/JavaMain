package codeWars;

public class DoubleKola {

    public static void main(String[] args) {

        // Best practice
        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 1;

        while ( n > names.length){
            n = (n - (names.length - 1)) / 2;
        }
        System.out.println(names[n-1]);

//        int n = 1;
//
//        int p = 0;
//
//        int initial = 0;
//
//        while (initial < n){
//
//            initial += (int)(5 * Math.pow(2, p));
//            p++;
//        }
//        p--;
//        initial -= (int)(5 * Math.pow(2, p));
//        n -= initial;
//
//        String result = "";
//
//        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
//
//        for (int i = 1; i < 6; i++){
//            if (n - (i * Math.pow(2, p)) <= 0){
//                result = names[i-1];
//                break;
//            }
//        }
//        System.out.println(result);

    }

}
