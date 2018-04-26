package derekBanasTut;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Tutorial11 {
    public static void main(String[] args) {
        // ArrayList, by default can accept any dataType
        ArrayList newArrayList = new ArrayList(); // Doesn't need a limit
        newArrayList.add(1);
        newArrayList.add(0.1);
        newArrayList.add("one");
//        System.out.println(newArrayList);

        ArrayList<String> newStringList = new ArrayList<String>();
        newStringList.add("Hello");
        newStringList.add("it's");
        String author = "Adele";
        newStringList.add(author);
        newStringList.add(2, "me");

        newStringList.remove(0);
//        System.out.println(newStringList.contains(author));
        ArrayList StringListCopy = new ArrayList();
        StringListCopy.addAll(newStringList);
//        newStringList.remove(1);
        System.out.println(newStringList.containsAll(StringListCopy));
        StringListCopy.clear();
        if (StringListCopy.isEmpty()){
            System.out.println("The array is empty!");
        }
        Object[] moreLyrics = new Object[4];
        moreLyrics = newStringList.toArray();
        System.out.println(Arrays.toString(moreLyrics));

//        for (int i = 0; i < newStringList.size(); i++){
//            System.out.println(newStringList.get(i));

        // the same as

//        for (String i : newStringList){
//            System.out.println(i);
//        }

        // or

        Iterator individualItem = newStringList.iterator();
        while(individualItem.hasNext()){
            System.out.println(individualItem.next());
        }
    }
}
