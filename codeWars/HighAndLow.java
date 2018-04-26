package codeWars;

public class HighAndLow {

    public static void main(String[] args) {

        System.out.println(highAndLow("1 23 35 65"));

    }

    public static String highAndLow(String numbers) {
        String[] numList = numbers.split(" ");
        int maxNum = Integer.valueOf(numList[0]), minNum = Integer.valueOf(numList[0]);
        for (String digit : numList){
            maxNum = (Integer.parseInt(digit) > maxNum)? Integer.parseInt(digit) : maxNum;
        }
        for (String digit : numList){
            minNum = (Integer.parseInt(digit) < minNum)? Integer.parseInt(digit) : minNum;
        }
        return (String.valueOf(maxNum)+" "+String.valueOf(minNum));
    }

}
