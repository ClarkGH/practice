interface Part1 {
  public void dance();
  public void eat();
}

class Part2 implements Part1 {
  public void dance() {
    System.out.println("boogie fever!");
  }
  public void eat() {
    System.out.println("NOM NOM NOM!");
  }
}