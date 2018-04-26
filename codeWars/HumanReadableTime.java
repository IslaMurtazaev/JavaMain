package codeWars;

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
    }

    public static String makeReadable(int seconds) {


        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;

        String[] result = {String.valueOf(hours), String.valueOf(minutes), String.valueOf(seconds)};

        for (int i = 0; i < result.length; i++){
            if (result[i].length() == 1){
                result[i] = "0"+result[i];
            }
        }

        return String.join(":", result);
    }
}