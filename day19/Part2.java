import java.util.Random;

public class Part2 {
  public static void main(String[] args) {
    Random randomGenerator = new Random();

    int randomNum = randomGenerator.nextInt(10);
    System.out.println(randomNum);
  }
}