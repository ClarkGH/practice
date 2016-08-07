import java.util.*;

public class HashMap {
  public static void main(String[] args) {
    Map map = new HashMap();

    map.put("Father", "Grant");
    map.put("Mother", "Gayle");
    map.put("Brother", "Trent");
    map.put("Sister1", "Brittany");
    map.put("Sister2", "Marissa");

    System.out.println(map.get("Father"));
  }
}