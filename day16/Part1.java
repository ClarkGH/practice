// anonymous classes

public static void main(String[] args){
  Part1 p = new Part1() {
    @Override public void go() {
      System.out.println("ohhhh yeah");
    }
  };
  a.go();
}