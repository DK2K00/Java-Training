package abstractClass.intro;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("R8");
        audi.doors();
        audi.wheels();
        audi.petrol();

        Bike royal = new Bike("Thunderbird");
        royal.doors();
        royal.wheels();
        royal.petrol();
    }
}
