package week4coding;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

public class Lists {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  List<String> Sports = new ArrayList<String>();
  Sports.add("Basketball");
  Sports.add("Baseball");
  Sports.add("volleyball");
  Sports.add("Football");  
  Sports.add("Futbol");  
  Sports.add("Soccer");  
  Sports.add("Tennis");  
  Sports.remove(2);
   
  for(int i = 0; i < Sports.size(); i++) {
   System.out.println(Sports.get(i));
  }
  
  for (String sport : Sports) {
    System.out.println(sport);
  }
    
  List<Integer> numbers = new ArrayList<Integer>();
  
  
  
  
  }// end of main method

}// end of main class
