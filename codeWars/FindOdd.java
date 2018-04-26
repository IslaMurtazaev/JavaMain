package codeWars;

public class FindOdd {

    public static void main(String[] args) {
        System.out.println(findIt((new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})));
    }

    public static int findIt(int[] A) {

        for (int i : A){
            int c = 0;
            int temp = i;
            for (int j : A){

                if (j == i){
                    c++;
                }

            }
            if (c%2==1){
                return temp;
            }
        }

        return 0;
    }

}
