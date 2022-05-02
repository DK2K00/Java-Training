package intro;

public class conditional_operators {

  public static void main(String[] args) {
    double one = 20.00d;
    double two = 80.00d;

    double total = (one + two) * 100;
    double remainder = total / 40.00d;

    boolean flag = remainder == 0 ? true : false;
    System.out.println(flag);

    if (!flag) {
      System.out.println("Got some remainder");
    }
  }
}
