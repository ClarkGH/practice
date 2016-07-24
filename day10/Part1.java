// encapsulation
class Part1 {
  private int num = 0;
  public void addNum(int x){
    if(x > 0) {
      num = x++;
    }
  }
}

// only the addNum method can change x