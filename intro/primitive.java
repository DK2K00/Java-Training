package intro;

public class primitive {

  public static void main(String[] args) {
    //To get the maximum and minimum value of the particular datatype
    int minVal = Integer.MIN_VALUE;
    int maxVal = Integer.MAX_VALUE;

    System.out.println("Min val = " + minVal);
    System.out.println("Max val = " + maxVal);

    System.out.println("Wrong Min val = " + (minVal - 1));
    System.out.println("Wrong Max val = " + (maxVal + 1));

    byte byteMinVal = Byte.MIN_VALUE;
    byte byteMaxVal = Byte.MAX_VALUE;
    System.out.println("Byte min val = " + byteMinVal);
    System.out.println("Byte max val = " + byteMaxVal);

    short shortMinVal = Byte.MIN_VALUE;
    short shortMaxVal = Byte.MAX_VALUE;
    System.out.println("Short min val = " + shortMinVal);
    System.out.println("Short max val = " + shortMaxVal);

    long longMinVal = Long.MIN_VALUE;
    long longMaxVal = Long.MAX_VALUE;
    System.out.println("Long min val = " + longMinVal);
    System.out.println("Long max val = " + longMaxVal);

    //To tell java we're using long datatype,
    //add a 'L' at the end of number
    long ranNum = 3523535647L;
    System.out.println(ranNum);

    //Type casting
    short num = 4567;
    short ans = (short) (num / 2);
    System.out.println(ans);

    //Challenge
    byte byteNum = 12;
    short shortNum = 345;
    int intNum = 6789;

    long longSum = 50000L + (10L * (byteNum + shortNum + intNum));
    System.out.println(longSum);
  }
}
