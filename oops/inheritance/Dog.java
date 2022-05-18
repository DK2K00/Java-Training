package oops.inheritance;

public class Dog extends Animal {

  private String hair;
  private int tail;

  public Dog(
    int legs,
    int arms,
    int eyes,
    String colour,
    String hair,
    int tail
  ) {
    //super is used to reference parent class
    //Here we use Animal constructor to initialize Animal constructor which is inheirted by Dog
    //super() must always be the first statement when used in a constructor
    super(4, 0, 2, colour);
    //This is Dog specific initialization
    this.hair = hair;
    this.tail = tail;
  }

  public String getHair() {
    return this.hair;
  }

  public int getTail() {
    return this.tail;
  }

  private void woof() {
    System.out.println("Woof Woof Woof");
  }

  public void sound() {
    System.out.println("Dog.sound() is called");
    woof();
    //super is usually used with method overriding
    super.sound();
  }
}
