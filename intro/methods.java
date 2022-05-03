package intro;

public class methods {

  public static void main(String[] args) {
    int one = 1;
    int two = 2;

    sum(one, two, 3);
  }

  public static int sum(int a, int b, int c) {
    int total = a + b + c;
    System.out.println("Sum = " + total);
    return total;
  }
}
