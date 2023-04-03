package week4coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class collections {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    List<String> students = new ArrayList<String>();
    students.add("Jemima");
    students.add("Jerome");
    students.add("Jenene");
    students.add("Jermaine");
    
    //String student = "";
    for(int i = 0; i < students.size(); i++) {
      //student += students.size(); 
      System.out.println(students.get(i));
    }
    
    //for(String student : students) {
    //System.out.println(student);
    //}
    
    Set<String> states = new HashSet<String>();
    states.add("California");
    states.add("California");// will not print duplicates
    states.add("Arizona");
    states.add("Hawaii");
    states.add("Michoacan");
    
    
    for(String state : states) {
      System.out.println(state);
    }
    //for(int i = 0; i <states.size(); i++) {
      //System.out.println(states.get(i));
    //}

    Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
    racerPlacements.put(1, "Sam");
    racerPlacements.put(2, "Tim");
    racerPlacements.put(3, "Lee");
    racerPlacements.put(4, "Leo");
    
    System.out.println(racerPlacements.get(2));
    
    Map<String, String> bBallPlayersNumbers = new HashMap<String, String>();
    bBallPlayersNumbers.put("MJ", "23");
    bBallPlayersNumbers.put("KB", "8");
    bBallPlayersNumbers.put("LBJ", "6");
    bBallPlayersNumbers.put("SC30", "30");
    
    System.out.println(bBallPlayersNumbers);
    
    Set<String> playerKeys = bBallPlayersNumbers.keySet();
      for(String key : playerKeys) {
        System.out.println(key + ": " + bBallPlayersNumbers.get(key));
      }
    
    
    
    
  }// end of main method
    

}// end of main class
