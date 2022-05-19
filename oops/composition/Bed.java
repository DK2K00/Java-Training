package oops.composition;

public class Bed {
    private String material;
    private String size;

    public Bed(String material, String size){
        this.material = material;
        this.size = size;
    }

    public void makeBed(){
        System.out.println("Bed is made");
    }
}
