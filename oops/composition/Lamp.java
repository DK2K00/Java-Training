package oops.composition;

public class Lamp {
    private String colour;
    private String voltage;

    public Lamp(String colour, String voltage){
        this.colour = colour;
        this.voltage = voltage;
    }

    public void turnOn(){
        System.out.println("Lamp is turned on");
    }
}
