// classes and objects

public class Part2 {
  public static void main (String[] args) {

    class PrivateDancer {

      String dance = "";

      public boolean theBodyGuard() {
        if (1 < 2) {
          return true;
        } else {
          return false;
        }
      }
    }

    PrivateDancer tinaTurner = new PrivateDancer();

    tinaTurner.dance = "Dancing for money";
    System.out.println(PrivateDancer.theBodyGuard());
  }
}