package abstractClass.intro;

public class Car extends Vehicle implements NeedsFuel {

    public Car(String name){
        super(name);
    }

    @Override
    public void doors(){
        System.out.println(getName() + " has four doors");
    }

    @Override
    public void wheels(){
        System.out.println(getName() + " has 4 wheels");
    }

    @Override
    public void petrol(){
        System.out.println(getName() + " usually needs a lot of petrol");
    }
}
