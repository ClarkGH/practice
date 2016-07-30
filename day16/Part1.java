// anonymous classes

class Part1 {
  public void go(){
    System.out.println("here we gooo");
  }
}

public static void main(String[] args){
  Part1 p1 = new Part1() {
    @Override public void go() {
      System.out.println("ohhhh yeah");
    }
  };
  Part1 p2 = new Part1();
  p2.go();
}
