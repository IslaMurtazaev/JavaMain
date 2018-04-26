package codeAcademy;

public class IAAU {
    public static void main(String[] args) {
//        String name = "Jon";
//        System.out.println(name.equals("John")); //str1.equalsIgnoreCase(str2); statsWith; endsWith; contains
//        System.out.println(name=="John");
//        System.out.println("my string" == "My String");
//        for (int j = 0; j <= 6; j += 2) {
//            System.out.println(j);
//        }
//        for (int n = 2; n <= 6; n++){
//            System.out.println(n+" squared = "+ n*n);
//        }

        // primitive int a = 1;       Wrapper Integer b = 1;
        int i = 1;
        Integer j = i;

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1; // ALIASing two objects

        arr1[1] = 0;
//        System.out.println(Arrays.toString(arr2)); // [1, 0, 3]

        int[] arrFrom = {1,2,3};
        int[] arrTo = new int[3];

        System.arraycopy(arrFrom, 0, arrTo, 0, 3);
//        System.out.println(Arrays.toString(arrTo)); // [1, 2, 3] (Copy of arr1)

    }
}
