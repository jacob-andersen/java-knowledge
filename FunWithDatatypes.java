import java.util.*;

public class FunWithDatatypes {


  static int number = 5;
  public static void show() {
    System.out.println("Inside a static method!");
  }


  public static void main(String[] args) {
    
   
    Integer a = 12;
    String s = "       hello hello hello hello     ";
    System.out.println(Integer.toBinaryString(a));
    FunWithDatatypes.show();


    // When an expression starts with a string, everything that follows is converted to strings
    // This may result in undesirable results

    // "hello" + 3 + 5 is NOT going to show "hello8", but instead shows "hello35"

    System.out.println(s + 3 + 5);

    // find first occurrence of substring
    int found = s.indexOf("hell");

    // keep searching and updating search beginIndex to find subsequent indexes of substring
    // if last substring has been found in string, indexOf() method will return -1
    // method : string.indexOf(searchstring) finds first index of searchstring
    // method : string.indexOf(searchstring, fromIndex) finds next index of searchstring STARTING
    // from fromIndex.
    // used together, these 2 methods can count how many times a substring appears in a string.

    while (found != -1) {
      System.out.println(found);

      int next = found + 1;
      
      found = s.indexOf("hell", next);
    }

    System.out.println(s.strip());

  Map<String, Integer> bunnies = new HashMap<>();
  bunnies.put("long ear", 3);
  bunnies.put("floppy", 8);
  bunnies.put("hoppy", 1);
  bunnies.forEach((k, v) -> System.out.println(k + " " + v));
}
}
