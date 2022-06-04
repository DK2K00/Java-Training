package abstractClass.intro;

public class Cycle extends Vehicle {
    public Cycle(String name){
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

}

