package derekBanasTut;

import java.util.Arrays;

public class Tutorial9 {
    public static void main(String[] args) {

        int[] intergerArray;
        int[] numArray = new int[10];
        intergerArray = new int[20];
        for (int j = 0; j < numArray.length; j++){
            numArray[j] = j;
        }
        System.out.println();
        System.out.println(Arrays.toString(numArray));

        int[] numArrayCopy = Arrays.copyOf(numArray, numArray.length);
        int[] numArrayCopy3to5 = Arrays.copyOfRange(numArray, 3, 6);
        System.out.println(Arrays.toString(numArrayCopy));
        System.out.println(Arrays.toString(numArrayCopy3to5));

        int i = 0;
        while (i<46){
            System.out.print("-");
            i++;
        }
        System.out.println();
        for (int j = 0; j <= numArray.length; j++){
            System.out.print("| "+j+" ");
        }
        System.out.println("|");
        String[] strArray = new String[5]; // no more than 5 items
        strArray[0] = "Meat";
        strArray[1] = "Banana";
        strArray[2] = "Apple";
        strArray[3] = "Socks";
        strArray[4] = "Sandwich";
        System.out.println(Arrays.toString(strArray));
        for(String row : strArray){
            System.out.print(row+", ");
        }
        System.out.println();

        String[] str7Array = {"This", "list", "will", "contain","only","these 7","elements"};
        System.out.println(Arrays.toString(str7Array));

        String[][] multiArray = new String[10][10];
        for(i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = i + " " + j;
            }
        }

        i = 0;
        while (i<62) {
            System.out.print("-");
            i++;
        }
        System.out.println();
        for(i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                System.out.print("| "+multiArray[i][j]+" ");
            }
            System.out.println("|");
        }
        i = 0;
        while (i<62) {
            System.out.print("-");
            i++;
        }

        System.out.println();
        // for(dataType[] varForRow : arrayName)
        for(String[] rows : multiArray){
            // for(dataType varForRow : arrayName)
            for (String column : rows){
                System.out.print("| "+column+" ");
            }
            System.out.println("|");
        }

        int[] numsToSort = new int[10];
        for(i = 0; i < 10; i++){
            numsToSort[i] = (int)(Math.random() * 100);
        }
        Arrays.sort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));
        int whereIs7 = Arrays.binarySearch(numArray, 7);
        System.out.println(whereIs7);
    }
}