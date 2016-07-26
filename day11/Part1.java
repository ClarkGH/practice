// inheritance
class Part1  {
  protected String tasteLevel;
  public void eat() {
    System.out.println("NOM NOM NOM!");
  }
}

class Bacon extends Part1 {
  Tasty() {
    tasteLevel = "helll yeah";
  }
}

// private methods are not inherited by the subclass