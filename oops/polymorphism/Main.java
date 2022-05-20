package oops.polymorphism;

class Car {

  private String name;

  public Car(String name) {
    this.name = name;
  }

  public String model() {
    return "Random";
  }

  public String getName() {
    return name;
  }
}

class Koenigsegg extends Car {

  public Koenigsegg() {
    super("Koenigsegg");
  }

  @Override
  public String model() {
    return "Agera R";
  }
}

class Tesla extends Car {

  public Tesla() {
    super("Tesla");
  }

  @Override
  public String model() {
    return "Model S";
  }
}

class Audi extends Car {

  public Audi() {
    super("Audi");
  }

  public String model() {
    return "Q7";
  }
}

class Pagani extends Car {

  public Pagani() {
    super("Pagani");
  }
  //No model
  //Polymorphism will take care of things
}

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
      Car car = randomCar();
      System.out.println(
        "Car No." +
        i +
        " : " +
        car.getName() +
        "\n" +
        "Model: " +
        car.model() +
        "\n"
      );
    }
  }

  public static Car randomCar() {
    int num = (int) (Math.random() * 4) + 1;
    System.out.println("Random number generated: " + num);

    switch (num) {
      case 1:
        return new Koenigsegg();
      case 2:
        return new Tesla();
      case 3:
        return new Audi();
      case 4:
        return new Pagani();
    }

    return null;
  }
}
