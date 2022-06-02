package interfaces.basics;

public class Car implements IFunctionality {

  @Override
  public void enterCar() {
    System.out.println("User has entered his car");
  }

  @Override
  public void startCar() {
    System.out.println("User has started his car");
  }

  @Override
  public void goForward() {
    System.out.println("User is going forward");
  }

  @Override
  public void reverse() {
    System.out.println("User is reversing his car");
  }
}
