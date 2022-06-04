package abstractClass.intro;

public class Bike extends Vehicle implements NeedsFuel {
    public Bike(String name){
        super(name);
    }

    @Override
    public void doors(){
        System.out.println(getName() + " has no doors");
    }

    @Override
    public void wheels(){
        System.out.println(getName() + " has 2 wheels");
    }

    @Override
    public void petrol(){
        System.out.println("Bikes need petrol");
    }

}
