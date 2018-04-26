package codeAcademy;

import java.util.HashMap;

public class Friends {
    public static void main(String[] args){
        HashMap<String, Integer> myFriends = new HashMap<>();

        myFriends.put("Mark", 24);
        myFriends.put("Cassandra", 25);
        myFriends.put("Zenas", 21);

        System.out.println( myFriends.size() );

        for (String name: myFriends.keySet()) {

            System.out.println(name + " is age: " + myFriends.get(name));

        }
    }
}
