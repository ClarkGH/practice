public class Part2 {
  public static void main(String[] args) {
    Part1 p1 = new Part1();
    Part1 p2 = new Part1();    
    Part1 p3 = new Part1();
    System.out.println(Part1.COUNT);
  }
}

// The output is 3

// if you want a value to stay constant, use final
// ex: public static final int num = 3