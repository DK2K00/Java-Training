package oops.inheritance;

public class Animal {

  private int legs;
  private int arms;
  private int eyes;
  private String colour;

  public Animal(int legs, int arms, int eyes, String colour) {
    this.legs = legs;
    this.arms = arms;
    this.eyes = eyes;
    this.colour = colour;
  }

  public Animal() {
    this(4, 0, 2, "white");
  }

  public int getarms() {
    return this.arms;
  }

  public int geteyes() {
    return this.eyes;
  }

  public String getColour() {
    return this.colour;
  }

  public int getLegs() {
    return this.legs;
  }

  public void sound() {
    System.out.println("Animal.sound() is called");
  }
}
