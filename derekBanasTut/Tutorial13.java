package derekBanasTut;

import java.util.Arrays;

public class Tutorial13 {

    public static void main(String[] args) {

        String phrase = "He said: \"I'm here!\"";
        System.out.println(phrase);


        String lowerCs = "big";
        String upperCs = "BIG";
        if (lowerCs.equalsIgnoreCase(upperCs)){
            System.out.println("They are equal");
        }

        System.out.println("2nd letter is "+upperCs.charAt(1));

        System.out.println("abcde".compareTo("fghij")); // compares strings in alphabetical order

        System.out.println(lowerCs.contains("b"));

        System.out.println(upperCs.startsWith("B") && upperCs.endsWith("G"));

        System.out.println(Arrays.toString(phrase.split(" ")));

        System.out.println(upperCs.indexOf("IG")); // ALSO: .indexOf(toLookFor, startingPosition); .lastIndexOf()

        System.out.println(upperCs.replace("IG", "ig"));

        String[] letters = lowerCs.split("");
        System.out.println(Arrays.toString(letters));

        System.out.println(lowerCs.substring(0,2));

        System.out.println(lowerCs.toUpperCase());

        String randomString = "      abcde        ";
        System.out.println(randomString.trim()); //deletes whitespaces at the beginning and the end

        System.out.println("\nStrings are immutable, if you make a change, it doesn't change an original string " +
                "it recreates a string using more memory");
        // StringBuilder will not recreate a string, but change the original one
        StringBuilder randSB = new StringBuilder("A random value");
        System.out.println(randSB.append(" again"));
        System.out.println(randSB);
        System.out.println(randSB.delete(15, 21));
        System.out.println(randSB.capacity()); // how much memory a SB can take
        randSB.ensureCapacity(60); // encreasing its limit
        System.out.println(randSB.capacity());
        System.out.println(randSB.length());
        randSB.trimToSize(); // now the capacity == length
        System.out.println(randSB.capacity());
        System.out.println(randSB.insert(1, "nother"));
        String oldSB = randSB.toString();

    }

}
