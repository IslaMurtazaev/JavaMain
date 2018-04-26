package headFirst;

public class PhraseOMatric {

    public static void main(String[] args) {

        String[] wordList1 = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
            "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordList2 = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
            "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted",
            "shared", "cooperative", "accelerated"};

        String[] wordList3 = {"process", "tripping-point", "solution", "architecture", "core competency", "strategy",
            "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int listLen1 = wordList1.length;
        int listLen2 = wordList2.length;
        int listLen3 = wordList3.length;

        int randIndex1 = (int) (Math.random() * listLen1);
        int randIndex2 = (int) (Math.random() * listLen2);
        int randIndex3 = (int) (Math.random() * listLen3);

        String phrase = wordList1[randIndex1]+" "+wordList2[randIndex2]+" "+wordList3[randIndex3];

        System.out.println("What we need is "+phrase);

    }

}
