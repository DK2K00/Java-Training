package arrays;

public class Main {

  public static void main(String[] args) {
    int[] intArray = new int[10];
    intArray[0] = 1;
    intArray[9] = 10;

    for (int i = 0; i < 10; i++) {
      intArray[i] = (i + 1) * 10;
      System.out.println(intArray[i]);
    }

    arrAverage(intArray);

    double[] doArr = {1.0, 2.0, 3.0};
    //Will not print peoperly
    System.out.println(doArr);
  }

  public static double arrAverage(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    System.out.println("Sum = " + sum);
    double avg = (double) sum / arr.length;
    System.out.println("Average = " + avg);
    return avg;
  }
}
