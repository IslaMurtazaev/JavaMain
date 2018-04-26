package codeWars;

public class DigPow {

    public static void main(String[] args) {

        System.out.println(digPow(46288 , 3));

    }

    public static long digPow(int n, int p) {

        String[] numsStr = (String.valueOf(n)).split("");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        int sum = 0;
        for (int d : nums){
            sum += Math.pow(d, p);
            p++;
        }

        if (sum%n == 0){
            return sum/n;
        }

        return -1;
    }

}