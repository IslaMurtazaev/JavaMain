package derekBanasTut;

import java.util.Arrays;
import java.util.regex.*;

public class Tutorial19 {

    public static void main(String[] args){
        String longString = "Islam Murtazaev CA 12345 PA 1-(412)555-1212 islam.muratazaev@gmail.com islam.murtazaev@mail.ru 412-555-1234 412 555-1234";
        String strangeStr = "1Z aaa **** *** {{{ {{ { ";
        String test1 = "aaa hey bay 1 123 2345 32";

        /**     REGEXes:
         *
         *      [A-Za-z] == [A-z]  ->   all lexicographical characters
         *      \\w  ->  [A-z0-9_]
         *      \\W -> [^A-z]
         *      \\d -> [0-9]
         *      \\D -> [^0-9]
         *      \\s -> whiteSpace
         *
         *      regex{minLength, maxLength}
         *      regex+ == {1,}
         *      regex{n} -> length == n
         *
         *      You can use plus, or and other signs to manipulate your regexes
         *      EX: (\\s+(\\d)+\\s)
         *      EX: C[AOT] | A[KLRZ]
         *
         *      Protected REGEXes:
         *       . ^ * ? {} [] \| ()
         *
         *       EX: \\{{1,}
         *       EX: \\s?+(.+)+\\s?
         *       EX: [A-z0-9_\.%]+@[a-z]?mail\.(com|ru)  -> to search for mails
         *       EX: ([0-9]{1,3})?( |-)?\(?[0-9]{3}\)?( |-)?[0-9]{3}( |-)?[0-9]{4}  ->  to search for telephone numbers
         */

        // 1-(412)555-1212 412-555-1234 412 555-1234
        System.out.println(Arrays.toString(findSubstrs("[^A-z]", longString)));

    }

    private static String[] findSubstrs(String regex, String strToSearch){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(strToSearch);

        StringBuilder result = new StringBuilder();

        while (matcher.find()){
            result.append(matcher.group().trim()+" ");
//            System.out.println(matcher.group());
//            System.out.println("Starting index "+ matcher.start());
//            System.out.println("Ending index "+ matcher.end());
        }

        return result.toString().split(" ");
    }

    private static String replaceSubstrs(String regex, String strToSearch){

        return "";
    }

}
