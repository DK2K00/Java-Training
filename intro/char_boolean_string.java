package intro;

public class char_boolean_string {

  public static void main(String[] args) {
    char letter = 'D';
    char uniCode = '\u0044';

    System.out.println(letter);
    System.out.println(uniCode);

    //String is not a primitive datatype but a special class
    //which is basically a group of chars which is only limited by memory
    String trademark = "Trademark: ";
    String copyRight = trademark + " \u00a9 2022";
    System.out.println(copyRight);

    String number = "10";
    int nextNumber = 50;
    number = number + nextNumber;
    System.out.println(number);
    double num = 69.420d;
    number += num;
    System.out.println(number);
  }
}
