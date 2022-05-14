package oops.classes;

public class Car {

  //Using private for encapsulation
  //These are called fields(instance varialbes)
  private int doors;
  private int wheels;
  private String model;
  private String colour;

  //To protect encapsulation, we use methods for class access
  public void setModel(String model) {
    if(model.equals("S"))
        System.out.println("Fast car");
    else
        System.out.println("Normal car");
    this.model = model;
  }

  public String getModel() {
    System.out.println(this.model);
    return this.model;
  }
}
