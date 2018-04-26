package headFirst;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public String getName(){
        return name;
    }

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

//    public ArrayList<Integer> randNumLine(){
//
//        int randNum1 = ((int)(Math.random()*6)+1);
//        ArrayList<Integer> locs = new ArrayList<Integer>();
//        locs.add(randNum1-1);
//        locs.add(randNum1);
//        locs.add(randNum1+1);
//
//        return locs;
//    }

    public String checkYourSelf(String userInput){

//        int userInt = (Integer.parseInt(userInput));

        String result = "Miss...";

        int index = locationCells.indexOf(userInput);

        if (index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "Destroyed!!!";
                System.out.println("Send hello to David Jonson "+name+"!");
            } else {
                result = "Hit!";
            }
        } // close IF
        return result;
    } // END of METHOD

} // END of CLASS