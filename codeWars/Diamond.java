package codeWars;

class Diamond {

    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n) { // TODO finish this Kata

        if (n < 1 || n % 2 == 0){return null;}

        StringBuffer diamond = new StringBuffer();

        for (int i = 1; i <= n; i++){

            if (i < n/2){
                for (int j = 0; j < (n-i)/2; j++){
                    diamond.append(" ");
                }
                for (int j = 0; j < n-2*i; j++){
                    diamond.append("*");
                }
                diamond.append("\n");
            } else if (i > n/2 + 1){

            }

        }
        System.out.println(diamond);

        return "";
    }
}