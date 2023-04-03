package week4coding;

public class StringStringbuilder {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    String firstName = "Joe ";
    String middleInitial = "M ";
    String lastName = "Schmo";
    String space = " ";
    
    System.out.println(firstName.concat(lastName));
   
    String datUgh = disUgh("Ugh", 5);
    System.out.println(datUgh);
    
    StringBuilder fullName = new StringBuilder ("Sam");
      fullName.append(" Smith");
      System.out.println(fullName.toString());
    //System.out.println(firstName + middleInitial + lastName + " ");
   /* StringBuilder sb = new StringBuilder();
    sb.append(firstName);
    sb.append(middleInitial);
    sb.append(lastName);
    System.out.println(sb.toString());*/
    
    //sb.insert(firstName.length()+1 , middleInitial + space); 
   //System.out.println(sb.toString());
    
    
  }// end main method
  public static String disUgh (String str, int num) {
    StringBuilder result = new StringBuilder ();
    for (int i = 0; i < num; i++) {
      result.append(str);
    }
    return result.toString();
  }
  
}// end main class

