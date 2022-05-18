package oops.inheritance;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal(2, 2, 2, "brown");
    animal.getColour();
    animal.sound();

    Dog lab = new Dog(4, 0, 2, "fawn", "yes", 1);
    lab.getLegs();
    lab.sound();
  }
}
