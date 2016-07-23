// value types

class Part3 {
  public static void main (String[] args){
    int x = 5;
    incrementator(x);
    System.out.println(x);
  }
  static void incrementator(int num){
    num = num + 1;
  }
}