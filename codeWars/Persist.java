package codeWars;

class Persist {

    public static void main(String[] args) {

        System.out.println(persistence(4));

    }


    public static int persistence(long n) {

        String nStr = String.valueOf(n);

        int c = 0;

        while (nStr.length() > 1){
            int sum = Integer.parseInt(String.valueOf(nStr.charAt(0)));
            for (int i = 1; i < nStr.length(); i++){
                sum *= Integer.parseInt(String.valueOf(nStr.charAt(i)));
            }
            nStr = String.valueOf(sum);
            c++;
        }
        return c;
    }


}